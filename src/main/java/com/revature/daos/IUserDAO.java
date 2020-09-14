package com.revature.daos;

import com.revature.models.User;

public interface IUserDAO {

	public User findUserByUsernamePassword(String username, String password);
	
	public User findUserByUsername(String username);
	
	public boolean insert(User user);
}
