package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description= "Details about car")
public class Car {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@ApiModelProperty(notes= "This is unique Id of car")
	private int carId;
	@ApiModelProperty(notes= "This is car's model")
	private String carModel;
	@ApiModelProperty(notes= "This is car's color")
	private String carColor;
	@ApiModelProperty(notes= "This is car's plate number")
	private String carPlateNo;
	@ApiModelProperty(notes= "This is year car was bought")
	private int year;
	
	public Car() {
		
	}

	public Car(int carId, String carModel, String carColor, String carPlateNo, int year) {
		super();
		this.carId = carId;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carPlateNo = carPlateNo;
		this.year = year;
	}

	
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
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
