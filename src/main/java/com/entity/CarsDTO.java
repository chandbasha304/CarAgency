package com.entity;

public class CarsDTO {
	
	
	
	private String vehiclemodel;
	private String vehiclenumber;
	private int seatingcapacity;
	private Double rentperday;
	public String getCarstatus() {
		return carstatus;
	}
	public void setCarstatus(String carstatus) {
		this.carstatus = carstatus;
	}
	private String carstatus;
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
	
	public CarsDTO(String vehiclemodel, String vehiclenumber, int seatingcapacity, Double rentperday,
			String carstatus) {
		this.vehiclemodel = vehiclemodel;
		this.vehiclenumber = vehiclenumber;
		this.seatingcapacity = seatingcapacity;
		this.rentperday = rentperday;
		this.carstatus = carstatus;
	}
	@Override
	public String toString() {
		return "CarsDTO [vehiclemodel=" + vehiclemodel + ", vehiclenumber=" + vehiclenumber + ", seatingcapacity="
				+ seatingcapacity + ", rentperday=" + rentperday + ", carstatus=" + carstatus + "]";
	}
	public CarsDTO() {
		
	}
	
	
	

}
