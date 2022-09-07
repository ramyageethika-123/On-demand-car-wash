package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description= "Login Details")
public class Login {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@ApiModelProperty(notes= "This is unique Id to login")
	private int id;
	@ApiModelProperty(notes= "This is email and username for login")
	private String email;
	@ApiModelProperty(notes= "This is password for login")
	private String pass;
	
	public Login() {
		
	}
	
	public Login(int id, String email, String pass) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
