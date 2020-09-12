package com.revature.daos;

import java.sql.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Event;
import com.revature.utils.HibernateUtil;

public class EventDAO implements IEventDAO {
	private static final Logger log = LogManager.getLogger(EventDAO.class);

	public EventDAO() {
	}

	@Override
	public List<Event> findAll() {
		Session session = HibernateUtil.getSession();

		List<Event> list = session.createQuery("FROM Event").list();

		log.info("Viewing all Event");
		System.out.println(list + " ");
		return list;
	}

	@Override
	public Event findByDate(Date date) {
		Session session = HibernateUtil.getSession();

		Event event = session.createQuery("FROM Type WHERE type='" + date + "'", Event.class).list().get(0);
		return event;
	}

	@Override
	public boolean addEvent(Event event) {
		Session ses = HibernateUtil.getSession();
		Transaction trans = ses.beginTransaction();
		try {
			ses.save(event);
			trans.commit();
			return true;
		} catch (HibernateException e) {
			log.info("Could not add Type");
			e.printStackTrace();
			return false;
		}
	}

}
