package com.example.AirIndia.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AirIndia.model.AirIndia;
import com.example.AirIndia.repo.Repo;

@Service
public class Serviceimpl implements Serviceinter{

	@Autowired
	Repo r;
	@Override
	public void add(AirIndia a) {
		
		r.save(a);
	}
	@Override
	public List<AirIndia> alldata() {
		return (List<AirIndia>) r.findAll();
	}

}
