package com.repository;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.AvailableCars;
import com.entity.BookedCars;

@Repository
public class BookingCarRepo {
	
	@Autowired
	UserBookings finalbooking;
	
	@Autowired
	VehicleOperations vehicleInformation;
	
	
	
	public BookedCars bookingCar(String modelCar, String number, String email, String date, String days)
	{
		
		AvailableCars datafound = vehicleInformation.findByVehiclemodelAndVehiclenumber(modelCar, number);
		Double rentForbookedcar = datafound.getRentperday();
		System.out.println(rentForbookedcar+"***********************************");
		int numberofdays = Integer.parseInt(days);
		
		BookedCars bookedCars = new BookedCars(0, email, modelCar, number, numberofdays, date, rentForbookedcar);
		BookedCars save = finalbooking.save(bookedCars);
		System.out.println(save+"*******************************");
		AvailableCars setCarstatus = vehicleInformation.findByVehiclemodelAndVehiclenumber(modelCar, number);
		setCarstatus.setCarstatus("Not Available");
		AvailableCars save2 = vehicleInformation.save(setCarstatus);
		System.out.println(save2);
		
		return save;
	}
	
	public List<BookedCars> getBookedCars()
	{
		
		List<BookedCars> allCars = finalbooking.findAll();
		return allCars;
	}

}
