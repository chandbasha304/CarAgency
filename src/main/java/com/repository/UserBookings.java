package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.BookedCars;

public interface UserBookings  extends JpaRepository<BookedCars, Integer>{

}
