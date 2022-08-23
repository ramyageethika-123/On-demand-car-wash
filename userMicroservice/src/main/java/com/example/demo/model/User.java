package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int userId;
	private String name;
	private String email;
	private int number;
	private String car;
	
	public User(int userId, String name, String email, int number, String car) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.number = number;
		this.car = car;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
