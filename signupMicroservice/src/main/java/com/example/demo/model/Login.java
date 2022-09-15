package com.example.demo.model;

import javax.persistence.Column;
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
	@ApiModelProperty(notes= "This is username for login")
	private String username;
	@ApiModelProperty(notes= "This is password for login")
	@Column(length=60)
	private String password;
	@ApiModelProperty(notes= "This is role")
	private String role;
	@ApiModelProperty(notes= "This is first name of user")
	private String firstName;
	@ApiModelProperty(notes= "This is last name of user")
	private String lastName;
	@ApiModelProperty(notes= "This is email of user")
	private String email;
	//private boolean enabled = false;

	public Login() {
		
	}

	public Login(int id, String username, String password, String role, String firstName, String lastName, String email,
			boolean enabled) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
