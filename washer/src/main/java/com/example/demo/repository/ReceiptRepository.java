package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Receipt;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt,Integer>{

}
