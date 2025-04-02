package com.airlines.CreateBookingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CreateBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateBookingServiceApplication.class, args);
	}

}
