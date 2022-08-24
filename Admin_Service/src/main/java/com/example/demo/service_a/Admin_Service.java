package com.example.demo.service_a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Washer;
import com.example.demo.repository.Admin_Repository;

@Service
public class Admin_Service {
	@Autowired
	private static Admin_Repository adminRepository;
	public Admin addWasher(Washer washer) {
		return adminRepository.save(washer);
	}

	public static Admin getWasherById(int washerid) {
		return adminRepository.findByWasherid(washerid);
	}

	public static Admin updateWasher(Washer washer) {
		return adminRepository.save(washer);
	}

	public String deleteWasherById(int washerid) { 
		adminRepository.deleteById((long)washerid);
		return "Washer deleted"; 
	}
	
		
}
