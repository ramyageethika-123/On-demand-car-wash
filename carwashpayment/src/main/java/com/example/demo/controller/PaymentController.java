package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PaymentDetails;
import com.example.demo.service.PaymentService;

	@RestController
	@RequestMapping("/hello_carwasherpayment")
	public class PaymentController {

		@GetMapping	
				public String Hello() {
					return "Hello World 4";
				}

			}

	    


