package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user) {
		return userRepository.save(user);
		
	}
	public User getUserById(int userId) {
		return userRepository.findByUserId(userId);
	}
	
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	/*
	 * public String deleteUserById(int userId) { userRepository.deleteById(userId);
	 * return "User deleted"; }
	 */
	
}
