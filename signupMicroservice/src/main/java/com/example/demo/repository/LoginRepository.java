package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;
import com.example.demo.model.User;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {
	
	//User findByUserId(int userId);
	Login findById(int id);

	//void deleteById(int id);
}
