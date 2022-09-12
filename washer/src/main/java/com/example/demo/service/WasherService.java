package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Washer;
import com.example.demo.repository.WashRepository;

@Service
public class WasherService {
			@Autowired
		private WashRepository washRepository;
		
				
				
		public Washer addProfile(Washer washer) {
			return washRepository.save(washer);
		}
		public Washer getProfileByIdI(int washerId) {
			return washRepository.findByWasherId(washerId);
		}
		public Washer updateProfile(Washer washer) {
			return washRepository.save(washer);
		}
		
		
		
	}
