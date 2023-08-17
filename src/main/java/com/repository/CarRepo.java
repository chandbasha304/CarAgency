package com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.AvailableCars;
import com.entity.CarsDTO;

@Repository
public class CarRepo {


	@Autowired
	VehicleOperations displayCars;


	public List<CarsDTO> showingCars()
	{
		System.out.println("Repo Layer");

		List<AvailableCars> findAll = displayCars.findAll();

		ArrayList<CarsDTO> cars=new ArrayList<>();
		for (AvailableCars availableCars : findAll) {
			System.out.println(availableCars);
			
			CarsDTO carsDTO = new CarsDTO();
			if (availableCars.getCarstatus().equalsIgnoreCase("available")) {
				
				BeanUtils.copyProperties(availableCars, carsDTO);
				cars.add(carsDTO);
				
			}

		}

		System.out.println(cars);



		return cars;
	}
	
	
	public Boolean newCarInformation(String modelCar, String carNumber, String seats, String rentperday)
	{

		double rentAmount = Double.parseDouble(rentperday);
		
		int seatsCapacity = Integer.parseInt(seats);
		AvailableCars availableCars = new AvailableCars(0, modelCar, carNumber,seatsCapacity, rentAmount,"Available");
		AvailableCars save = displayCars.save(availableCars);
		
		if(save !=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
