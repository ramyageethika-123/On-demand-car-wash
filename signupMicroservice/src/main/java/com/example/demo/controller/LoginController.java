package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/addlogin",method=RequestMethod.POST)
	public Login addLogin(@RequestBody Login login) {
		return loginService.addLoginDetails(login);
	}
	
	@RequestMapping(value="/getbyid/{id}", method= RequestMethod.GET) 
	  public Login getLogin(@PathVariable("id")int id){ 
		  return loginService.getLoginById(id);
	  }
	 
	
	  @RequestMapping(value="/updatelogin", method=RequestMethod.PUT) 
	  public Login updateLogin(@RequestBody Login login) {
		  return loginService.updateLogin(login); 
	  }
	  
	  @GetMapping("/deletelogin/{id}")
	  public String deleteLogin(@PathVariable Long id) {
		  loginService.deleteLogintById(id);
			return "Account Deleted";
	  }

}
