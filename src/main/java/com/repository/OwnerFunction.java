package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Agencyowner;
import com.entity.Customers;

@Repository
public class OwnerFunction {
	
	@Autowired
	AgencyOwnerOperations newData;
	
	
	
	public Boolean ownerDetailsAdding(String agencyname, String ownername, String email, String phonenumber, String address, String password)
	{
		
		Agencyowner agencyowner = new Agencyowner(0, agencyname, ownername, email, phonenumber, address, password);
		
		Agencyowner save = newData.save(agencyowner);
		
		if(save.getAgencyname().equals(agencyname))
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
	
	
	
	public Boolean ownerLoginStep(String usermail,String userPassword)
	{
		Agencyowner dataFound = newData.findByOwnermailAndOwnerpassword(usermail, userPassword);
		
		if(dataFound != null)
		{
			
		
		boolean ok=dataFound.getOwnermail().equals(usermail)   & dataFound.getOwnerpassword().equals(userPassword);
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
