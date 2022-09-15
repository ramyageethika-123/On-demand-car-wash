package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Car;
import com.example.demo.model.EmailBody;
import com.example.demo.model.PlaceOrder;
import com.example.demo.model.Receipt;
import com.example.demo.model.UserProfile;
import com.example.demo.model.Washer;
import com.example.demo.repository.ReceiptRepository;
import com.example.demo.repository.WashRepository;

@Service
public class WasherService {
	@Autowired
	private WashRepository washRepository;
	
	@Autowired
	private ReceiptRepository receiptRepo;
	
	@Autowired
    private EmailService emailService;
	
	@Autowired
	private RestTemplate restTemplate;

	public Washer addProfile(Washer washer) {
		return washRepository.save(washer);
	}

	public Washer getProfileByIdI(int washerId) {
		return washRepository.findByWasherId(washerId);
	}

	public Washer updateProfile(Washer washer) {
		return washRepository.save(washer);
	}
	//receipt
	public Receipt saveReceipt(Receipt receipt) {
		UserProfile profile =restTemplate.getForObject("http://USER-SERVICE/user/getprofilebyid/14", UserProfile.class);
		PlaceOrder order =restTemplate.getForObject("http://USER-SERVICE/user/getorderbyid/"+receipt.getOrderId(), PlaceOrder.class);
		
		Car car= restTemplate.getForObject("http://USER-SERVICE/user/getbyid/"+receipt.getCarId(), Car.class);
		
		
		receipt.setOrderId(order.getOrderId());
		receipt.setCarId(car.getCarId());
		receipt.setEmail(profile.getEmailId());
		receipt.setOrderId(order.getOrderId());
		receipt.setAmount(receipt.getAmount());
		receipt.setService(order.getService());
		receipt.setAddon(order.getAddOn());
		receiptRepo.save(receipt);

			String Message = "Your car wash for order Id  = " + order.getOrderId()+" is completed !!";
	        String Name = "Name = " +profile.getFullName();  
	       // String Order = "Booked for Date = " +order.getWashDate();
	        String Service= "Your order service is ="+order.getService();
	        String addon = "Applied addons are =" +order.getAddOn();
	        String Car = "Selected car for wash =" +car.getCarModel() +","+car.getCarColor()+","+car.getCarPlateNo()+","
	        		+car.getYear();
	        String Status= "Your total amount is ="+receipt.getAmount();



	        EmailBody emailDetail = new EmailBody();
	        emailDetail.setBody(Message +"\n" +Name +"\n" +Car +"\n" +Service +"\n" +addon +"\n" +Status +"\n");
	        emailDetail.setToMail(receipt.getEmail());
	        emailDetail.setSubject("Order Receipt");



	    String emailResponse = new String();

	        if (order != null) {
	             emailResponse = emailService.sendSimpleMail(emailDetail);
	          }
	        return receipt;
	}
}
