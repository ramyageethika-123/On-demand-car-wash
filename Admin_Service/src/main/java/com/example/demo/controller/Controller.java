package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.service.Adminservice;
@RestController
@RequestMapping("/admin")
public class Controller{
	@Autowired
	private Adminservice adminservice;
	
	@PostMapping("/addadmin")
	public Admin addAdmin(Admin admin) {
		return adminservice.addAdminDetails(admin);
	}
	
}