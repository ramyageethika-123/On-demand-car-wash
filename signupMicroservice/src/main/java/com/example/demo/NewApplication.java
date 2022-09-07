package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NewApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewApplication.class, args);
	}
	
	@Bean
	public Docket SwaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/signup/**"))
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("This is Signup API", "You can login here", "version.1", "Free to use",
				new springfox.documentation.service.Contact("Bhavya", "http://localhost:8082/user/getprofilebyid/14", "bhavya@gmail.com"), "API License", 
				"http://localhost:8082/user/getprofilebyid/14",
				Collections.emptyList());
	}


}
