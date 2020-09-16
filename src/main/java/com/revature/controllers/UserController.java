package com.revature.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.LoginDTO;
import com.revature.models.User;
import com.revature.models.UserDTO;
import com.revature.services.UserServices;

@RestController
public class UserController {

	@Autowired
	private UserServices userService;

	@PostMapping("/login")
	public @ResponseBody User login(@RequestBody LoginDTO loginDTO) {
		return userService.login(loginDTO.username, loginDTO.password);

	}
	@PostMapping("/register")
	public @ResponseBody User register(@RequestBody UserDTO loginDTO) {
		return userService.register(loginDTO);

	}
}
