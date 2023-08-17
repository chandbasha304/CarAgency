package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.AvailableCars;
import com.entity.CarsDTO;
import com.repository.CarRepo;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class CarService {
	
	
	@Autowired
	CarRepo carDetails;
	
	
	public List<CarsDTO> getdataFromRepo()
	{
		System.out.println("Service Layer");
		List<CarsDTO> showingCars = carDetails.showingCars();
		return showingCars;
	}
	
	
	public Boolean addcarData(HttpServletRequest data)
	{
		System.out.println("Service Layer");
		
		
		
		String modelCar = data.getParameter("vehiclemodel");
		
		String carNumber = data.getParameter("vehiclenumber");
		String seats = data.getParameter("seatingcapacity");
		String rentperday = data.getParameter("rent");
		
		Boolean newCarInformation = carDetails.newCarInformation(modelCar,carNumber,seats,rentperday);
		return newCarInformation;
	}

}
