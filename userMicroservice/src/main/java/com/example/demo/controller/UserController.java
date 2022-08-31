package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Profile;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addcar")
	public User addCar(@RequestBody User user) {
		return userService.addCar(user);
	}

	@GetMapping("/getbyid/{carId}")
	public User getCar(@PathVariable("carId") int carId) {
		return userService.getCarById(carId);
	}

	@PutMapping("/updatecar")
	public User updateCar(@RequestBody User user) {
		return userService.updateCar(user);
	}
	
	@DeleteMapping("/deletebyId/{carId}")
	public String deleteCarById(@PathVariable("carId") int carId) {
		return userService.deleteCarById(carId);
	}
	
	
	@PostMapping("/addprofile")
	public Profile addProfile(@RequestBody Profile profile) {
		return userService.addProfile(profile);
	}
	
	@GetMapping("/getprofilebyid/{userId}")
	public Profile getProfile(@PathVariable("userId") int userId) {
		return userService.getProfileByIdI(userId);
	}
	
	@PutMapping("/updateprofile")
	public Profile updateProfile(@RequestBody Profile profile) {
		return userService.updateProfile(profile);
	}
	 

}
