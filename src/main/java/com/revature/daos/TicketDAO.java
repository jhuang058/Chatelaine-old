package com.revature.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.MaintenanceTicket;
import com.revature.models.TicketStatus;
import com.revature.models.User;
import com.revature.utils.HibernateUtil;


public class TicketDAO implements ITicketDAO{

	private IUserDAO uDao = new UserDAO();

	@Override
	public MaintenanceTicket findById(int id) {
		Session ses = HibernateUtil.getSession();
		
		MaintenanceTicket t = ses.get(MaintenanceTicket.class, id);
		return t;
	}

	@Override
	public List<MaintenanceTicket> findAll() {
		Session ses = HibernateUtil.getSession();
		
		List<MaintenanceTicket> list = ses.createQuery("FROM MaintenanceTicket").list();
		return list;
	}

	@Override
	public TicketStatus findTicketStatus(int id) {
		Session ses = HibernateUtil.getSession();
		
		TicketStatus status = ses.get(TicketStatus.class, id);
		return status;
	}

	@Override
	public boolean addTicket(MaintenanceTicket t) {
		Session ses = HibernateUtil.getSession();
		
		try {
			ses.save(t);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<MaintenanceTicket> findByAuthor(int id) {
		Session ses = HibernateUtil.getSession();
		
		User u = uDao.findById(id);
		Query query = ses.createQuery("FROM MaintenanceTicket where author=:author",MaintenanceTicket.class);
		query.setParameter("author", u);
		
		return query.getResultList();
	}

	@Override
	public List<MaintenanceTicket> findByStatus(int id) {
		Session ses = HibernateUtil.getSession();
		
		TicketStatus status = findTicketStatus(id);
		Query query = ses.createQuery("FROM MaintenanceTicket where status=:ts",MaintenanceTicket.class);
		query.setParameter("ts", status);
		
		return query.getResultList();
	}

	@Override
	public boolean updateTicket(MaintenanceTicket t) {
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		try {
			ses.merge(t);
			tx.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

}
