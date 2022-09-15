package com.example.demo.model;

//import javax.persistence.Entity;

public class EmailBody {
	
	private String toMail;
	private String username;
	private String subject;
	private String body;
	
	public EmailBody() {
		
	}
	public EmailBody(String toMail, String username, String subject, String body) {
		super();
		this.toMail = toMail;
		this.username = username;
		this.subject = subject;
		this.body = body;
	}
	public String getToMail() {
		return toMail;
	}
	public void setToMail(String toMail) {
		this.toMail = toMail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	

}
