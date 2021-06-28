package com.example.login.service;
import java.util.List;
import com.example.login.entity.User;
@org.springframework.stereotype.Service

public interface Service{
	
	public User saveUser(User user) ;
	
	public List<User> getUsers();
	
	public User registerUser(User user) throws Exception;
	
	public User fetchUserByEmail(String email) ;
	
	public User loginUser(User user) throws Exception ;
	
	public User fetchUserByEmailAndPassword(String email, String password);
}