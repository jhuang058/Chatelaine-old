package com.revature.daos;

import java.sql.Timestamp;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.models.Events;
import com.revature.utils.HibernateUtil;

public class EventDAO implements IEventDAO {
	private static final Logger log = LogManager.getLogger(EventDAO.class);


	public EventDAO() {
	}

	@Override
	public List<Events> findAll() {
		Session session = HibernateUtil.getSession();
		
		List<Events> list = session.createQuery("FROM Events").list();
		
		log.info("Viewing all Events");
		System.out.println(list + " ");
		return list;
	}

	@Override
	public Events findByDate(Timestamp date) {
		Session session = HibernateUtil.getSession();
		
		Events event = session.createQuery("FROM Type WHERE type='" + date + "'", Events.class).list().get(0);
		return event;
	}

	@Override
	public boolean addEvent(Events event) {
		Session ses = HibernateUtil.getSession();
		
		try {
			ses.save(event);
			return true;	
	} catch (HibernateException e) {
		log.info("Could not add Type");
		e.printStackTrace();
		return false;
	}
	}

}
