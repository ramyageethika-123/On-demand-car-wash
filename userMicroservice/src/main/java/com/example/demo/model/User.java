package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int carId;
	private String carModel;
	private String carColor;
	private String carPlateNo;
	private int year;
	
	public User() {
		
	}

	public User(int carId, String carModel, String carColor, String carPlateNo, int year) {
		super();
		this.carId = carId;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carPlateNo = carPlateNo;
		this.year = year;
	}

	
	public int getUserId() {
		return carId;
	}

	public void setUserId(int userId) {
		this.carId = carId;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarPlateNo() {
		return carPlateNo;
	}

	public void setCarPlateNo(String carPlateNo) {
		this.carPlateNo = carPlateNo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
