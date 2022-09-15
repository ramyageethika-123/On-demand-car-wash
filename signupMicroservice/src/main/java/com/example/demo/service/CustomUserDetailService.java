package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.CustomUserDetails;
import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	private LoginRepository loginRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Login login = loginRepository.findByUsername(username);
		if(login == null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		return new CustomUserDetails(login);
	}

}
