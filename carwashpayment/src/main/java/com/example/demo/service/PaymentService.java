package com.example.demo.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.PaymentDetails;
import com.example.demo.repository.PaymentRepository;

public class PaymentService {
	@Autowired
    private PaymentRepository repository;

    public PaymentDetails doPay(PaymentDetails payment){
        payment.setPaymentStatus(paymentStatus());
        payment.setTxId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    private String paymentStatus(){

        return new Random().nextBoolean()?"success":"failure";
    }

}
