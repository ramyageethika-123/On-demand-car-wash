package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class paymentConroller {
	@RestController
	public class UserController {

		@RequestMapping("/hello_carwasherpayment")
		public String Hello() {
			return "Hello World 4";
		}

	}
}
