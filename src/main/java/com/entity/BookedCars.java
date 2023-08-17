package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name = "bookedcars")
public class BookedCars {
	
	
	
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	
	private String useremail;
	private String carmodel;
	private String carnumber;
	private int numberofdays;
	private String bookeddate;
	private Double rentperday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public int getNumberofdays() {
		return numberofdays;
	}
	public void setNumberofdays(int numberofdays) {
		this.numberofdays = numberofdays;
	}
	public String getBookeddate() {
		return bookeddate;
	}
	public void setBookeddate(String bookeddate) {
		this.bookeddate = bookeddate;
	}
	public Double getRentperday() {
		return rentperday;
	}
	public void setRentperday(Double rentperday) {
		this.rentperday = rentperday;
	}
	@Override
	public String toString() {
		return "BookedCars [id=" + id + ", useremail=" + useremail + ", carmodel=" + carmodel + ", carnumber="
				+ carnumber + ", numberofdays=" + numberofdays + ", bookeddate=" + bookeddate + ", rentperday="
				+ rentperday + "]";
	}
	public BookedCars(int id, String useremail, String carmodel, String carnumber, int numberofdays, String bookeddate,
			Double rentperday) {
		this.id = id;
		this.useremail = useremail;
		this.carmodel = carmodel;
		this.carnumber = carnumber;
		this.numberofdays = numberofdays;
		this.bookeddate = bookeddate;
		this.rentperday = rentperday;
	}
	public BookedCars() {
		
	}
	
	


}
