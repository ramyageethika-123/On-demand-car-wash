package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Receipt {
	
	@Id
	private int recId;
	private String amount;
	private String service;
	private String addon;
	private int carId;
	private String email;
	private int orderId;
	

	public Receipt() {
		
	}


	public Receipt(int recId, String amount, String service, String addon, int carId,String email,int orderId) {
		super();
		this.recId = recId;
		this.amount = amount;
		this.service = service;
		this.addon = addon;
		this.carId = carId;
		this.email=email;
		this.orderId=orderId;
	}


	public int getRecId() {
		return recId;
	}


	public void setRecId(int recId) {
		this.recId = recId;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getService() {
		return service;
	}


	public void setService(String service) {
		this.service = service;
	}


	public String getAddon() {
		return addon;
	}


	public void setAddon(String addon) {
		this.addon = addon;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	
	
	
	
	

}
