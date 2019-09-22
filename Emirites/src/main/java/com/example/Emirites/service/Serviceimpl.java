package com.example.Emirites.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Emirites.model.Emirites;
import com.example.Emirites.repo.Repo;

@Service
public class Serviceimpl implements Serviceinter{
	@Autowired
	Repo s;
	@Override
	public void add(Emirites e) {
		
		s.save(e);
	}

	@Override
	public List<Emirites> getall() {
		return (List<Emirites>) s.findAll();
	}

	
}
