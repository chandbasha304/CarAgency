package com.repository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.entity.Customers;

@Repository
public class CustomerFunctions {

	@Autowired
	CustomerOperations customerWork;



	public Boolean customerDataAdding(String name, String address, String number, String mail, String license, String password)
	{

		Customers customers = new Customers(0, name, address, number, mail, license, password);
		Customers save = customerWork.save(customers);

		if (save.getCustomermail().equals(mail)) {
			return true;

		}
		else
		{
			return false;
		}

	}


	public Boolean customerLoginStep(String usermail,String userPassword)
	{
		Customers dataFound = customerWork.findByCustomermailAndCustomerpassword(usermail, userPassword);
		
		if(dataFound != null)
		{
			
		
		boolean ok=dataFound.getCustomermail().equals(usermail)   & dataFound.getCustomerpassword().equals(userPassword);
		System.out.println(ok+"************************************************");
		
		
		
		if(ok)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		}
		else
		{
			return false;
		}
		
		
		
	}
	
	

	
}

