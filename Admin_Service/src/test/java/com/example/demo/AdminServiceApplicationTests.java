package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Washer;
import com.example.demo.repository.Admin_Repository;
import com.example.demo.service_a.Admin_Service;

@SpringBootTest
class AdminServiceApplicationTests {

	private static final Admin Admin = null;

	@Test
	void contextLoads() {
	}
	@Autowired
	private Admin_Service adminService;
	
	@MockBean
	private Admin_Repository adminRepository;
	
	@Test
	void testAddWasher() {
		Washer washer =  new Washer(1,"xyz","abc@gmail.com");
		Mockito.when(adminRepository.save(washer)).thenReturn(Admin);
		assertEquals(washer, adminService.addWasher(washer));
	}
	
	@Test
	void testfindByUserId() {
		Washer washer =  new Washer(1,"xyz","abc@gmail.com");
		Mockito.when(adminRepository.findByWasherid(1)).thenReturn(Admin);
		assertEquals(washer, Admin_Service.getWasherById(1));
	}
	
	@Test
	void testUpdateUser() {
		Washer washer =  new Washer(1,"xyz","abc@gmail.com");
		adminRepository.save(washer);
		washer.setName("xyz");
		adminRepository.save(washer);
		
		assertEquals("xyz", washer.getName());
	}
		
	@Test 
	void testdeleteWasherById() { 
		Washer washer = new Washer(1,"xyz","abc@gmail.com"); 
		assertEquals("Washer deleted",adminService.deleteWasherById(1)); 
		}


}
