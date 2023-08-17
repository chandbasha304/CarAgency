package com.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.BookedCars;
import com.repository.BookingCarRepo;
import com.repository.UserBookings;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class BookingService {
	
	
	@Autowired
	BookingCarRepo bookService;
	
	
	public BookedCars bookingDataStartProcess(HttpServletRequest data)
	{
		
		String modelCar = data.getParameter("carmodel");
		String number = data.getParameter("carnumber");
		String email = data.getParameter("customeremail");
		String date = data.getParameter("startdate");
		String days = data.getParameter("days");
		
		
		System.out.println(modelCar);
		System.out.println(number);
		System.out.println(email);
		System.out.println(date);
		System.out.println(days);
BookedCars bookingCar = bookService.bookingCar(modelCar,number,email,date,days);		
		
		return bookingCar;
	}

	
	public List<BookedCars> getCarsFromRepo()
	{
		
		List<BookedCars> bookedCars = bookService.getBookedCars();
		return bookedCars;
	}
}
 