package com.example.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.login.entity.User;
import com.example.login.service.Service;

@RestController
public class Controller {
	
	@Autowired
	private Service service;
	
	@PostMapping("/registerUser")
	public User registerUser(@RequestBody User user) throws Exception {
		return service.registerUser(user);
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return service.getUsers();
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user)throws Exception {
		return service.loginUser(user);
	}
	
	
}
