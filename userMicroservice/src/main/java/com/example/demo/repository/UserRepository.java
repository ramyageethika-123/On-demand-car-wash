package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Car;

@Repository
public interface UserRepository extends JpaRepository<Car, Integer>{
	
	Car findByCarId(int carId);

	//void deleteById(int carId);

	

}