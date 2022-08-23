package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	@GetMapping("/getbyid/{userId}")
	public User getUser(@PathVariable("userId") int userId){
		return userService.getUserById(userId);
	}
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

}
