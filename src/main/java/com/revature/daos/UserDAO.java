package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.revature.models.Event;

import com.revature.models.Role;
import com.revature.models.User;
import com.revature.utils.HibernateUtil;

@Repository
@Transactional
public class UserDAO implements IUserDAO {

	private static final Logger log = LogManager.getLogger(UserDAO.class);

	@Override
	public User findByUsername(String username) {
		Session session = HibernateUtil.getSession();

		User u = session.createQuery("FROM User WHERE username='" + username+ "'", User.class).list().get(0);
		return u;
	}

	@Override
	public User findById(int id) {
		Session ses = HibernateUtil.getSession();
		
		User u = ses.get(User.class, id);
		return u;
	}

	@Override
	public List<User> findAll() {
		Session session = HibernateUtil.getSession();

		List<User> list = session.createQuery("FROM User").list();

		log.info("Viewing all Event");
		System.out.println(list + " ");
		return list;
	}

	@Override
	public boolean addUser(User u) {
		Session ses = HibernateUtil.getSession();
		
		try {
			ses.save(u);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			log.info("Could not add User");
			return false;
		}
	}

	@Override
	public Role findUserRole(User u) {
		return null;
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		Session session = HibernateUtil.getSession();

		User u = session.createQuery("FROM User WHERE username='" + username+ "' AND password ='" + password + "'", User.class).list().get(0);
		return u;
	}

}
