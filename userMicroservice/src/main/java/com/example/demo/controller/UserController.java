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
import com.example.demo.model.Car;
import com.example.demo.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addcar")
	@ApiOperation(value="You can add your car details here", response = Car.class)
	public Car addCar(@RequestBody Car user) {
		return userService.addCar(user);
	}

	@GetMapping("/getbyid/{carId}")
	@ApiOperation(value="Find car by id",notes="Provide unique car id", response = Car.class)
	public Car getCar(@PathVariable("carId") int carId) {
		return userService.getCarById(carId);
	}

	@PutMapping("/updatecar")
	@ApiOperation(value="You can update your car details here", response = Car.class)
	public Car updateCar(@RequestBody Car user) {
		return userService.updateCar(user);
	}
	
	@DeleteMapping("/deletebyId/{carId}")
	@ApiOperation(value="You can delete car details by id",notes="Provide unique car id", response = Car.class)
	public String deleteCarById(@PathVariable("carId") int carId) {
		return userService.deleteCarById(carId);
	}
	
	//Profile
	
	@PostMapping("/addprofile")
	@ApiOperation(value="You can add your profile details here", response = Profile.class)
	public Profile addProfile(@RequestBody Profile profile) {
		return userService.addProfile(profile);
	}
	
	@GetMapping("/getprofilebyid/{userId}")
	@ApiOperation(value="Find user's profile by id",notes="Provide unique user id", response = Profile.class)
	public Profile getProfile(@PathVariable("userId") int userId) {
		return userService.getProfileByIdI(userId);
	}
	
	@PutMapping("/updateprofile")
	@ApiOperation(value="You can update your profile details here", response = Profile.class)
	public Profile updateProfile(@RequestBody Profile profile) {
		return userService.updateProfile(profile);
	}
	 

}
