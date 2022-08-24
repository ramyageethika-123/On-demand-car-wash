package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Washer;
import com.example.demo.service_a.Admin_Service;

@RestController
@RequestMapping("/admin")
public class Controller {
	
	@Autowired
	private Admin_Service adminservice;
	
	@PostMapping("/add_washer")
	public Admin addWasher(@RequestBody Washer washer) {
		return adminservice.addWasher(washer);
	}
	@GetMapping("/getbyid/{washerid}")
	public Admin getWasher(@PathVariable("washerid") int washerid){
		return Admin_Service.getWasherById(washerid);
	}
	@PutMapping("/updatewasher")
	public Admin updateWasher(@RequestBody Washer washer) {
		return Admin_Service.updateWasher(washer);
	}
	
}
	 

