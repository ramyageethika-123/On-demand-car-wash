package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {
	
	Login findById(int id);
	
	Login findByUsername(String username);

	//void deleteById(Long id);

	//Login findByEmailAndPassword(String email,String password);

	//Login findByEmail(String email);
}
