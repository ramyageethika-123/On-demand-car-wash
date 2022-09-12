package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Washer;

@Repository
public interface WashRepository extends JpaRepository<Washer, Long>{

	Washer findByWasherId(int washerId); 

}
