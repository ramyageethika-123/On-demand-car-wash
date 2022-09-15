package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Login registerUser(Login login) {
		Login login1 = new Login();
		login1.setEmail(login1.getEmail());
		login1.setFirstName(login1.getFirstName());
		login1.setLastName(login1.getLastName());
		login1.setRole("USER");
		login1.setPassword(passwordEncoder.encode(login1.getPassword()));
		loginRepository.save(login1);
		return login1;
		
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
