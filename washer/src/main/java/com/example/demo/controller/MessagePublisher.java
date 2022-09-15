package com.example.demo.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.MQConfig;
import com.example.demo.model.CustomMessage;

@RestController
public class MessagePublisher {
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/order-status")
	public String publishMessage(@RequestBody CustomMessage message) {
		message.setMessageId(UUID.randomUUID().toString());
		message.setMessadeDate(new Date());
		message.setMessage("Messages");
		template.convertAndSend(MQConfig.EXCHANGE, 
				MQConfig.ROUTING_KEY, message);
		return "Message Published";
	}

}
