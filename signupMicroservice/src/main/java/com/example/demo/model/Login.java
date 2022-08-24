package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	private String email;
	private String pass;
	
	public Login() {
		
	}
	
	public Login(Long id, String email, String pass) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
