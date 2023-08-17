package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.CustomerFunctions;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class CustomerService {
	
	@Autowired
	CustomerFunctions customerfunction;
	
	
	public Boolean customerInformationAdding(HttpServletRequest data)
	{
		
		
		String name = data.getParameter("customername");
		String address = data.getParameter("customeraddress");
		String number = data.getParameter("customernumber");
		String mail = data.getParameter("customermail");
		String license = data.getParameter("customerlicense");
		String password = data.getParameter("customerpassword");
		
		Boolean dataAdded = customerfunction.customerDataAdding(name,address,number,mail,license,password);
		return dataAdded;
	}
	
	public Boolean customerCredentialsFinding( HttpServletRequest data)
	{
		
		String mail = data.getParameter("customermail");
		String password = data.getParameter("customerpassword");
		Boolean credentials  = customerfunction.customerLoginStep(mail, password);
		return credentials;
	}

}
