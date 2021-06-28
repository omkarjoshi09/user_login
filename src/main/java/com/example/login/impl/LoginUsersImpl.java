package com.example.login.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.login.entity.User;
import com.example.login.repository.UserRepository;
import com.example.login.service.Service;

public class LoginUsersImpl implements Service {
	
	@Autowired
	UserRepository repository;

	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return repository.findAll();
	}

	@Override
	public User registerUser(User user) throws Exception {
		String email = user.getEmailId();
		if(email!=null && !"".equals(email)) {
			User userobj = fetchUserByEmail(email);
			if(userobj!= null) {
				throw new Exception("User with "+ email + "already exists");
			}
		}
		return saveUser(user);
	}

	@Override
	public User fetchUserByEmail(String email) {
		return repository.findByEmailId(email);
	}

	@Override
	public User loginUser(User user) throws Exception {
		String email = user.getEmailId();
		String password = user.getPassword();
		User userObj = null ;
		if(email!= null && password!= null) {
			 userObj = fetchUserByEmailAndPassword(email, password);
		}
		if(userObj==null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}

	@Override
	public User fetchUserByEmailAndPassword(String email, String password) {
		return repository.findByEmailIdAndPassword(email,password);
	}

}
