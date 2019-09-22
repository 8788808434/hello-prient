package com.example.GO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.GO.model.Go;
import com.example.GO.service.Serviceinter;

@RestController
public class Mycontroller {
	@Autowired
	Serviceinter s;
	@RequestMapping(value="/Go",consumes="application/json",method=RequestMethod.POST)
	public void save(@RequestBody Go g)
	{
		s.save(g);
	}
	@RequestMapping(value="/Go",produces="application/json",method=RequestMethod.GET)
	public List<Go> getall()
	{
		return s.getall();
	}
}
