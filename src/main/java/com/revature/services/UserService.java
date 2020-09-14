package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.daos.UserDAO;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.models.UserDTO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private UserRoleService userRoleService;
	
	public User login(String username, String password) {
		return userDAO.findUserByUsernamePassword(username, password);
	}
	
	public boolean register(UserDTO userDTO) {
		Role userRole = userRoleService.findByName(userDTO.getRole());
		User user = new User(userDTO.getUsername(), userDTO.getPassword(), userDTO.getFirstName(), userDTO.getLastName(), userDTO.getPhoneNumber(), userRole);
		return false;
	}
}
