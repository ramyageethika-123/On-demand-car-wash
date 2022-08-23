package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
	public class WashDetailsService {

	   
	    private WashDetailsRepository WashDetailsRepository;

	    public String saveWashDetails(WashDetails washDetails){

	        WashDetails details1 = new WashDetails(
	                washDetails.getUser(),
	                washDetails.getDate(),
	                washDetails.getCharges(),
	                washDetails.getUser_package()

	        );

	        WashDetailsRepository.save(details1);

	        return "Details Saved!";
	    }

	    public String getWashDetails( Long Id){

	        WashDetails retrievedWashDetails;
	        Optional<WashDetails> wrappedWashDetails = WashDetailsRepository.findById(Id);
	        if(wrappedWashDetails.isPresent()){
	            retrievedWashDetails = wrappedWashDetails.get();
	        }
	        return "Here are the details!";
	    }

	}



