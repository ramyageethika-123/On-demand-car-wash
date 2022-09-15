package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description= "Details about order")
public class PlaceOrder {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int orderId;
	private int carId;
	private String address;
	private String washDate;
	private String service;
	private String addOn;
	private String status;
	
	public PlaceOrder() {
		
	}
	public PlaceOrder(int orderId, int carId, String address, String washDate, String service, String addOn, String status) {
		super();
		this.orderId = orderId;
		this.carId = carId;
		this.address = address;
		this.washDate = washDate;
		this.service = service;
		this.addOn = addOn;
		this.status=status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
