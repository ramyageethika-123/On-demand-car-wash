package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.entity.*;


public interface Admin_Repository extends JpaRepository<Admin, Long>{
	
	@Query(value="SELECT * FROM admins admin WHERE admin.id like %:keyword% admin.name like %:keyword% or admin.email like %:keyword%",nativeQuery=true)
	
	List<Admin> findByKeyword(@Param ("keyword") String keyword);

}