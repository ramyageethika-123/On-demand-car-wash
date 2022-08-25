package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Admin {
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    
    private int id;
    private String name;
    private String email;
    private String phnnumber;
    public Admin() {
    	
    }
    public Admin(int id, String name, String email, String phnnumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phnnumber = phnnumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPhnnumber() {
		return phnnumber;
	}
	public void setPhnnumber(String phnnumber) {
		this.phnnumber = phnnumber;
	}
    
	
    
}