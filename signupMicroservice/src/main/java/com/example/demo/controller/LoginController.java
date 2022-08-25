package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/signup")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/addlogin")
	public Login addLogin(@RequestBody Login login) {
		return loginService.addLoginDetails(login);
	}
	
	@GetMapping("/getbyid/{id}") 
	  public Login getLogin(@PathVariable("id")int id){ 
		  return loginService.getLoginById(id);
	  }
	 
	
	  @PutMapping("/updatelogin") 
	  public Login updateLogin(@RequestBody Login login) {
		  return loginService.updateLogin(login); 
	  }
	  
	  @GetMapping("/deletelogin/{id}")
	  public String deleteLogin(@PathVariable("id") int id) {
		  return loginService.deleteLoginById(id);
	  }

}
