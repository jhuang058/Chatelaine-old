package com.revature.daos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.models.User;
import com.revature.utils.HibernateUtil;

@Component
public class UserDAO implements IUserDAO {

	@Override
	public User findUserByUsernamePassword(String username, String password) {
		Session ses = HibernateUtil.getSession();

		List<User> userList = ses.createQuery(
				"FROM User u WHERE u.username = '" + username + "' and u.password = '" + password + "'", User.class).list();

		if (userList != null && userList.size() > 0) {
			return userList.get(0);
		}

		return null;
	}

	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User user) {
		Session ses = HibernateUtil.getSession();

		Transaction tx = ses.beginTransaction();

		try {
			ses.saveOrUpdate(user);
			tx.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

}
