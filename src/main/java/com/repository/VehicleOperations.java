package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.AvailableCars;

public interface VehicleOperations extends JpaRepository<AvailableCars, Integer> {
	
	AvailableCars findByVehiclemodelAndVehiclenumber(String model,String number);

}
