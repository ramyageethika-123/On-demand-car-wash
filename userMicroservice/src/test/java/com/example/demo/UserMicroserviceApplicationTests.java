package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@SpringBootTest
class UserMicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private UserService userService;
	
	@MockBean
	private UserRepository userRepository;
	
	@Test
	void testAddUser() {
		User user =  new User(1,"Bhavya","abc@gmail.com","8767639526","Tata");
		Mockito.when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userService.addUser(user));
	}
	
	@Test
	void testfindByUserId() {
		User user =  new User(1,"Bhavya","abc@gmail.com","8767639526","Tata");
		Mockito.when(userRepository.findByUserId(1)).thenReturn(user);
		assertEquals(user, userService.getUserById(1));
	}
	
	@Test
	void testUpdateUser() {
		User user =  new User(1,"Bhavya","abc@gmail.com","8767639526","Tata");
		userRepository.save(user);
		user.setName("Bhavya Prakash");
		userRepository.save(user);
		
		assertEquals("Bhavya Prakash", user.getName());
	}
	
	
	
	
	
	/*
	 * @Test void testdeleteUserById() { User user = new
	 * User(1,"Bhavya","abc@gmail.com","8767639526","Tata"); assertEquals("User deleted",
	 * userService.deleteUserById(1)); }
	 */

}
