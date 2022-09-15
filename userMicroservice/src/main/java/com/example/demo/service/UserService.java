package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.UserProfile;
import com.example.demo.model.Status;
import com.example.demo.config.MQConfig;
import com.example.demo.model.Car;
import com.example.demo.model.EmailBody;
import com.example.demo.model.PlaceOrder;
import com.example.demo.repository.PlaceOrderRepository;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.repository.UserRepository;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProfileRepository profileRepository;
	
	@Autowired
	private PlaceOrderRepository placeOrderRepo;
	
	@Autowired
    private EmailService emailService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//car
	public Car addCar(Car user) {
		return userRepository.save(user);
		
	}
	public Car getCarById(int carId) {
		return userRepository.findByCarId(carId);
	}
	
	public List<Car> getAllCars(){
		return userRepository.findAll(); 
	}
	
	public Car updateCar(Car user) {
		return userRepository.save(user);
	}
	
	public String deleteCarById(int carId) {
		userRepository.deleteById(carId);
		return "User deleted";
	}
	
	//profile
	public UserProfile addProfile(UserProfile profile) {
		return profileRepository.save(profile);
	}
	public UserProfile getProfileByIdI(int userId) {
		return profileRepository.findByUserId(userId);
	}
	public UserProfile updateProfile(UserProfile profile) {
		return profileRepository.save(profile);
	}
	
	//placeorder
	
	public PlaceOrder saveOrderDetails(PlaceOrder order) {
		UserProfile profile =restTemplate.getForObject("http://localhost:8082/user/getprofilebyid/14", UserProfile.class);
		Car car= restTemplate.getForObject("http://localhost:8082/user/getbyid/"+order.getCarId(), Car.class);
		/*
		 * PlaceOrder createdOrder =new PlaceOrder(); createdOrder
		 * =placeOrderRepo.save(new PlaceOrder( order.getOrderId(), order.getCarId(),
		 * order.getEmail(), order.getWashDate(), order.getAddress(),
		 * order.getService(), order.getAddOn(), Status.FAIL ));
		 */
		order.setCarId(car.getCarId());
		order.setStatus(order.getStatus());
		order.setAddress(profile.getAddress());
		order.setEmail(profile.getEmailId());
		order.setService(order.getService());
		order.setAddOn(order.getAddOn());
		order.setUsername(order.getUsername());
		order.setWashDate(order.getWashDate());
		placeOrderRepo.save(order);

			String Message = "Your order Id for car Wash is = " + order.getOrderId();
	        String Name = "Name = " +profile.getFullName();
	        String Date = "Booked for Date = " +order.getWashDate();
	        String Status= "Your order is ="+order.getStatus();
	        String Service= "Your order service is ="+order.getService();
	        String addon = "Applied addons are =" +order.getAddOn();
	        String Car = "Selected car for wash =" +car.getCarModel() +","+car.getCarColor()+","+car.getCarPlateNo()+","
	        		+car.getYear();
	        String Address = "Address =" +profile.getAddress();
	        //  String Amount = "Ticket Price = " +createdTicket.getAmount();



	        EmailBody emailDetail = new EmailBody();
	        emailDetail.setBody(Message +"\n" +Name +"\n" +Car +"\n" +Address +"\n" +Service +"\n" +addon +"\n" +Status +"\n" +Date +"\n");
	        emailDetail.setToMail(order.getEmail());
	        emailDetail.setSubject("Order status");



	    String emailResponse = new String();

	        if (order != null) {
	             emailResponse = emailService.sendSimpleMail(emailDetail);
	          }
	        return order;
	}
	public PlaceOrder getOrderById(int orderId) {
		return placeOrderRepo.findByorderId(orderId);
	}
	
	public PlaceOrder updateOrder(PlaceOrder order) {
		return placeOrderRepo.save(order);
	}
	
	public String cancelOrderById(int orderId) {
		placeOrderRepo.deleteById(orderId);
		return "Order Cancelled";
	}
	
}
