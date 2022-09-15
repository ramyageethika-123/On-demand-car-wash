package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description= "Details about car")
public class PlaceOrder {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int orderId;
	private int carId;
	private String username;
	private String address;
	private String washDate;
	private String service;
	private String addOn;
	@Enumerated(EnumType.STRING)
	private Status status;
	private String email;
	public PlaceOrder() {
		
	}
	public PlaceOrder(int orderId, int carId, String address, String washDate, String service, String addOn, Status status, String email,String username) {
		super();
		this.orderId = orderId;
		this.carId = carId;
		this.address = address;
		this.washDate = washDate;
		this.service = service;
		this.addOn = addOn;
		this.status=status;
		this.email=email;
		this.username=username;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWashDate() {
		return washDate;
	}
	public void setWashDate(String washDate) {
		this.washDate = washDate;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getAddOn() {
		return addOn;
	}
	public void setAddOn(String addOn) {
		this.addOn = addOn;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
