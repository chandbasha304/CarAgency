package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.OwnerFunction;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class OwnerService {
	
	@Autowired
	OwnerFunction informationProcess;
	
	
	public Boolean ownerProcessInformation(HttpServletRequest data)
	{
		
		
		String agencyname = data.getParameter("agencyname");
		String ownername = data.getParameter("ownername");
		String email = data.getParameter("ownermail");
		String phonenumber = data.getParameter("ownernumber");
		String address = data.getParameter("owneraddress");
		String password = data.getParameter("ownerpassword");
		Boolean dataAdded = informationProcess.ownerDetailsAdding(agencyname,ownername,email,phonenumber,address,password);
		return dataAdded;
	}
	
	
	
	public Boolean ownerCredentialsFinding( HttpServletRequest data)
	{
		
		String mail = data.getParameter("owneremail");
		String password = data.getParameter("ownerpassword");
		Boolean credentials  = informationProcess.ownerLoginStep(mail, password);
		return credentials;
	}

}
