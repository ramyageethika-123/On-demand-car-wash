package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.example.demo.model.Washer;

import com.example.demo.repository.WashRepository;

import com.example.demo.service.WasherService;

@SpringBootTest
class WasherApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private WasherService washerService;
	
	@MockBean
	private WashRepository washRepository;
	
	
	
	
	@Test
	void testAddProfile() {
		Washer washer = new Washer(1, "Shruti",837363986,"abc@gmail.com", "shruti","1234","abc","hdueh","12-22-1223");
		Mockito.when(washRepository.save(washer)).thenReturn(washer);
		assertEquals(washer, washerService.addProfile(washer));
	}

	@Test
	void testfindByUserId() {
		Washer washer = new Washer(1, "Shruti",837426906,"abc@gmail.com", "shruti","1234","abc","hdueh","12-22-1223");
		Mockito.when(washRepository.findByWasherId(1)).thenReturn(washer);
		assertEquals(washer, washerService.getProfileByIdI(1));
	}

	@Test
	void testUpdateProfile() {
		Washer washer = new Washer(1, "Shruti",837426906,"abc@gmail.com", "shruti","1234","abc","hdueh","12-22-1223");
		washRepository.save(washer);
		washer.setGender("Female");
		washRepository.save(washer);

		assertEquals("Female", washer.getGender());
	}
	 
}
