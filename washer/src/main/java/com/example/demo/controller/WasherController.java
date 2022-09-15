package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Receipt;
import com.example.demo.model.PlaceOrder;
import com.example.demo.model.Washer;
import com.example.demo.service.WasherService;

import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/washer")

public class WasherController {
	
	@Autowired
	private WasherService washerService;

	@Autowired
    private RestTemplate restTemplate;
	
	@PostMapping("/addprofile")
	@ApiOperation(value="You can add your profile details here", response = Washer.class)
	public Washer addProfile(@RequestBody Washer washer) {
		return washerService.addProfile(washer);
	}
	
	@GetMapping("/getprofilebyid/{washerId}")
	@ApiOperation(value="Find user's profile by id",notes="Provide unique user id", response = Washer.class)
	public Washer getProfile(@PathVariable("washerId") int washerId) {
		return washerService.getProfileByIdI(washerId);
	}
	
	@PutMapping("/updateprofile")
	@ApiOperation(value="You can update your profile details here", response = Washer.class)
	public Washer updateProfile(@RequestBody Washer washer) {
		return washerService.updateProfile(washer);
	}
	 
	@PostMapping("/receipt")
	public Receipt addReceipt(Receipt receipt) {
		return washerService.saveReceipt(receipt);
	}

}
