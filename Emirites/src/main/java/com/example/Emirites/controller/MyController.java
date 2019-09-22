package com.example.Emirites.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Emirites.model.Emirites;
import com.example.Emirites.service.Serviceinter;

@RestController
public class MyController {
	@Autowired 
	Serviceinter s;
	@RequestMapping(value="/Emirites",consumes="application/json",method=RequestMethod.POST)
	public void save(@RequestBody Emirites e)
	{
		s.add(e);
	}
	
	@RequestMapping(value="/Emirites",produces="application/json",method=RequestMethod.GET)
	public List<Emirites> getall()
	{
		return s.getall();
	}
}
