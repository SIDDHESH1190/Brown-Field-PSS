package com.brownfield.pss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brownfield.pss.dao.UserDao;
import com.brownfield.pss.model.Role;
import com.brownfield.pss.model.User;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	UserDao userDao;

	@GetMapping("/registrationForm")
	public String registrationForm() {
		return "templates/Registration";
	}

	@PostMapping("/registerUser")
	public User registerUser(@RequestBody User user)
	{
		user.setRole(Role.CUSTOMER);
		return userDao.registerUser(user);
	}
}