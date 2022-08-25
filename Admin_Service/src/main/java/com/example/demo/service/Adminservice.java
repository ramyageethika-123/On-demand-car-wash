package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;
@Service
public class Adminservice {
	@Autowired
    private AdminRepository adminRepository;
	

	public Admin addAdminDetails(Admin admin) {
		return adminRepository.save(admin);
		
	}
}
