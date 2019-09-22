package com.example.DonBooking.controller;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.DonBooking.DonBookingApplication;

@RestController
public class MyController {

	RestTemplate re=DonBookingApplication.rest();
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/AirIndia",produces="application/json",method=RequestMethod.GET)
	public List show()
	{
		final String ur="http://localhost:8058/AirIndia";
		List l=re.getForObject(ur, List.class);
		System.out.println(l);
		return l;
		
	}
	
	@RequestMapping(value="/Go",produces="application/json",method=RequestMethod.GET)
	public List showgo()
	{
		System.out.println("hii");
		final String ur="http://localhost:8060/Go";
		List l=re.getForObject(ur,List.class);
		System.out.println(l);
		return l;
		
	}
}
