package com.example.demo.model;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomMessage {
	
	private String messageId;
	private String message;
	private Date messadeDate;
	public CustomMessage() {
		
	}
	public CustomMessage(String messageId, String message, Date messadeDate) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.messadeDate = messadeDate;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getMessadeDate() {
		return messadeDate;
	}
	public void setMessadeDate(Date messadeDate) {
		this.messadeDate = messadeDate;
	}
	
	

}
