package com.airlines.FlightSearchingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FlightSearchingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightSearchingServiceApplication.class, args);
	}

}
