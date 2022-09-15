package com.example.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.service.LoginService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/signup")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/user")
	public String User() {
		return "This is user page";
	}
	
	@GetMapping("/washer")
	public String Washer() {
		return "This is washer page";
	}
	
	@GetMapping("/admin")
	public String Admin() {
		return "This is Admin page";
	}
	@PostMapping("/register")
	@ApiOperation(value="You can register user from here", response = Login.class)
	public String addUser(@RequestBody Login login) {
		Login login1 = loginService.registerUser(login);
		return "Success";
		
	}
	
	@GetMapping("/getbyid/{id}") 
	@ApiOperation(value="Find by id",notes="Provide unique id", response = Login.class)
	  public Login getLogin(@PathVariable("id")int id){ 
		  return loginService.getLoginById(id);
	  }
	 
	
	  @PutMapping("/updatelogin") 
	  @ApiOperation(value="You can update signup details here", response = Login.class)
	  public Login updateLogin(@RequestBody Login login) {
		  return loginService.updateLogin(login); 
	  }
	  
	  @DeleteMapping("/deletelogin/{id}")
	  @ApiOperation(value="Delete by id",notes="Provide unique id", response = Login.class)
	  public String deleteLogin(@PathVariable("id") int id) {
		  return loginService.deleteLoginById(id);
	  }



}
