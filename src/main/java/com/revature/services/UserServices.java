package com.revature.services;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.daos.UserDAO;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.models.UserDTO;
import com.revature.utils.Hash;

@Service
public class UserServices {

	@Autowired
	private UserDAO userDAO;

	public User login(String username, String password) {
		try {
			return userDAO.findByUsernameAndPassword(username, Hash.generateHash(password, "MD5"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public User register(UserDTO loginDTO) {
		Role userRole = new Role();
		User user = new User(username, password, firstName, lastName, phoneNumber, userRole);
	}
}
