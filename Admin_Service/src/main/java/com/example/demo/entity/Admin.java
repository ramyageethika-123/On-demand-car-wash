package com.example.demo.entity;

import javax.persistence.Entity;


import javax.persistence.Id;


@Entity

public class Admin {
	
	@Id
	
	private int adminid;
	private String name;
	private String email;

	
	
	public Admin (int adminid, String name, String email) {
		this.adminid=adminid;
		this.name =name;
		this.email=email;
	}



	public int getId() {
		return adminid;
	}



	public void setId(int adminid) {
		this.adminid = adminid;
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
	

}
