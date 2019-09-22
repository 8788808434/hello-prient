package com.example.DonBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DonBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonBookingApplication.class, args);
	}
	
	public static RestTemplate rest()
	{
		return new RestTemplate();
	}

}
