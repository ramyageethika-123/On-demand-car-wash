package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.PlaceOrder;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PlaceOrderRepository extends JpaRepository<PlaceOrder,Integer>{

	PlaceOrder findByorderId(int orderId);

}
