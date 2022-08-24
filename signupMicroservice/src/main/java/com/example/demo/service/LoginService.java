package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public Login addLoginDetails(Login login) {
		return loginRepository.save(login);
		
	}
	
	public Login getLoginById(int id) {
		return loginRepository.findById(id);
	}
	
	public Login updateLogin(Login login) {
		return loginRepository.save(login);
	}
	
	public String deleteLoginById(int id) {
		loginRepository.deleteById(id);
		return "Account deleted";
	}
}
