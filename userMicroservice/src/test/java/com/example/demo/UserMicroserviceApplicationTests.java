package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.model.Profile;
import com.example.demo.model.User;
import com.example.demo.repository.ProfileRepository;
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
	
	@MockBean
	private ProfileRepository profileRepository;
	
	@Test
	void testAddCar() {
		User user = new User(1, "Audi", "Blue", "sh1221", 2014);
		Mockito.when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userService.addCar(user));
	}

	@Test
	void testfindByCarId() {
		User user = new User(1, "Audi", "Blue", "sh1221", 2014);
		Mockito.when(userRepository.findByCarId(1)).thenReturn(user);
		assertEquals(user, userService.getCarById(1));
	}

	@Test
	void testUpdateCar() {
		User user = new User(1, "Audi", "Blue", "sh1221", 2014);
		userRepository.save(user);
		user.setCarColor("Black");
		userRepository.save(user);

		assertEquals("Black", user.getCarColor());
	}
	  
	@Test
	void testdeleteCarById() {
		User user = new User(1, "Audi", "Blue", "sh1221", 2014);
		assertEquals("User deleted", userService.deleteCarById(1));
	}
	
	
	@Test
	void testAddProfile() {
		Profile profile = new Profile(1, "Bhavya Prakash",837363746,"abc@gmail.com", "bhavya","1234","abc","hdueh","12-22-1223","Female");
		Mockito.when(profileRepository.save(profile)).thenReturn(profile);
		assertEquals(profile, userService.addProfile(profile));
	}

	@Test
	void testfindByUserId() {
		Profile profile = new Profile(1, "Bhavya Prakash",837426746,"abc@gmail.com", "bhavya","1234","abc","hdueh","12-22-1223","Female");
		Mockito.when(profileRepository.findByUserId(1)).thenReturn(profile);
		assertEquals(profile, userService.getProfileByIdI(1));
	}

	@Test
	void testUpdateProfile() {
		Profile profile = new Profile(1, "Bhavya Prakash",837426746,"abc@gmail.com", "bhavya","1234","abc","hdueh","12-22-1223","Female");
		profileRepository.save(profile);
		profile.setAbout("abc");
		profileRepository.save(profile);

		assertEquals("abc", profile.getAbout());
	}
	 

}
