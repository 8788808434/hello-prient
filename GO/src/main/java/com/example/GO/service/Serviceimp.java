package com.example.GO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GO.model.Go;
import com.example.GO.repo.Repo;
@Service
public class Serviceimp implements Serviceinter{
	@Autowired 
	Repo r;
	@Override
	public void save(Go g) {
		r.save(g);
		
	}

	@Override
	public List<Go> getall() {
		// TODO Auto-generated method stub
		return (List<Go>) r.findAll();
	}

}
