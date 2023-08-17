package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "availablecars")
public class AvailableCars {
	
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	
	private String vehiclemodel;
	private String vehiclenumber;
	private int seatingcapacity;
	private Double rentperday;
	private String carstatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehiclemodel() {
		return vehiclemodel;
	}
	public void setVehiclemodel(String vehiclemodel) {
		this.vehiclemodel = vehiclemodel;
	}
	public String getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	public int getSeatingcapacity() {
		return seatingcapacity;
	}
	public void setSeatingcapacity(int seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}
	public Double getRentperday() {
		return rentperday;
	}
	public void setRentperday(Double rentperday) {
		this.rentperday = rentperday;
	}
	
	public AvailableCars(int id, String vehiclemodel, String vehiclenumber, int seatingcapacity, Double rentperday,
			String carstatus) {
		this.id = id;
		this.vehiclemodel = vehiclemodel;
		this.vehiclenumber = vehiclenumber;
		this.seatingcapacity = seatingcapacity;
		this.rentperday = rentperday;
		this.carstatus = carstatus;
	}
	@Override
	public String toString() {
		return "AvailableCars [id=" + id + ", vehiclemodel=" + vehiclemodel + ", vehiclenumber=" + vehiclenumber
				+ ", seatingcapacity=" + seatingcapacity + ", rentperday=" + rentperday + ", carstatus=" + carstatus
				+ "]";
	}
	public AvailableCars() {
		
	}
	public String getCarstatus() {
		return carstatus;
	}
	public void setCarstatus(String carstatus) {
		this.carstatus = carstatus;
	}
	
	
	

}
