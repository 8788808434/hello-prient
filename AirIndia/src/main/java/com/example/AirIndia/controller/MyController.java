package com.example.AirIndia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.AirIndia.model.AirIndia;
import com.example.AirIndia.service.Serviceinter;

@RestController
public class MyController {

	@Autowired
	Serviceinter s;
	@RequestMapping(value="/AirIndia",consumes="application/json",method=RequestMethod.POST)
	public void save(@RequestBody AirIndia a)
	{
		s.add(a);
	}
	
	@RequestMapping(value="/AirIndia",produces="application/json",method=RequestMethod.GET)
	public List<AirIndia> getdetails()
	{
		return s.alldata();
	}
	
}
