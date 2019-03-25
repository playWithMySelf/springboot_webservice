package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.webservice"})
public class WebserviceserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceserverApplication.class, args);
	}

}
