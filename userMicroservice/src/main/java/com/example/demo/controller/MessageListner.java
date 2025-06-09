package com.example.demo.controller;

import java.util.Optional;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.config.MQConfig;
import com.example.demo.model.CustomMessage;
import com.example.demo.model.EmailBody;
import com.example.demo.model.PlaceOrder;
import com.example.demo.model.Status;
import com.example.demo.repository.PlaceOrderRepository;
import com.example.demo.service.EmailService;

@Component
public class MessageListner {

	@Autowired
	private PlaceOrderRepository orderRepository;

	@Autowired
	private EmailService emailService;

	@RabbitListener(queues = MQConfig.QUEUE)
	public void listener(CustomMessage message) {
		String msg = message.getMessage();
		char firstChar = msg.charAt(0);

		PlaceOrder order = new PlaceOrder();
		int ordId = order.getOrderId();

		Optional<PlaceOrder> opOrder = orderRepository.findById(ordId);
		if (opOrder.isPresent()) {
			order = opOrder.get();

			if (firstChar == 's') {

				order.setStatus(Status.SUCCESS);
				orderRepository.save(order);

				System.out.println(order.toString());

				String Message = "Your Order id is : " + order.getOrderId() + "\r\n" + "car for wash: "
						+ order.getCarId() + "\r\n" + "Service Selected: " + order.getService() + "\r\n" + "Date: "
						+ order.getWashDate() + "\r\n" + "ADD-On: " + order.getAddOn() + "\r\n";

				EmailBody emailDetail = new EmailBody();
				emailDetail.setBody(Message);
				emailDetail.setToMail(order.getEmail());
				emailDetail.setSubject("Order Details");

				String emailResponse = emailService.sendSimpleMail(emailDetail);

			} else {
				orderRepository.deleteById(ordId);

				String Message = "Booking for Order Id: " + order.getOrderId() + " Failed!";

				EmailBody emailDetail = new EmailBody();
				emailDetail.setBody(Message);
				emailDetail.setToMail(order.getEmail());
				emailDetail.setSubject("Order Details");

				String emailResponse = emailService.sendSimpleMail(emailDetail);

			}

		} else {
			System.out.println("Such Ticket doesn't exist");
		}

		System.out.println(message);
	}

}
