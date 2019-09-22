package com.example.AirIndia.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class AirIndia {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long pno;
	private String location;
	private Date date;
	private int availablity;
	public long getPno() {
		return pno;
	}
	public void setPno(long pno) {
		this.pno = pno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAvailablity() {
		return availablity;
	}
	public void setAvailablity(int availablity) {
		this.availablity = availablity;
	}
	
	
}
