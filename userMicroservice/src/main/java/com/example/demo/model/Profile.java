package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int userId;
	private String fullName;
	private long phone;
	private String emailId;
	private String username;
	private String password;
	private String address;
	private String about;
	private String dob;
	private String gender;
	
	public Profile() {
		
	}
	
	public Profile(int userId, String fullName, long phone, String emailId, String username, String password, String address,
			String about, String dob, String gender) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.phone = phone;
		this.emailId = emailId;
		this.username = username;
		this.password = password;
		this.address = address;
		this.about = about;
		this.dob = dob;
		this.gender = gender;
	}
	
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
