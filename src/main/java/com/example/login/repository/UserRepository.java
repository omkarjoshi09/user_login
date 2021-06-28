package com.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.login.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByEmailId(String email);
	
	public User findByEmailIdAndPassword(String email, String passsword);
}
