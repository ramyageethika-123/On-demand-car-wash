package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserProfile;


@Repository
public interface ProfileRepository extends JpaRepository<UserProfile, Long>{
	
	UserProfile findByUserId(int userId);
	

}
