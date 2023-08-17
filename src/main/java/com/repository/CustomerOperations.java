package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Customers;

public interface CustomerOperations extends JpaRepository<Customers, Integer>{
	
	
	
	Customers findByCustomermailAndCustomerpassword(String mail,String password);

}
