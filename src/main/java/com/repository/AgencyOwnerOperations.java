package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.entity.Agencyowner;

public interface AgencyOwnerOperations extends JpaRepository<Agencyowner, Integer>{
	
	
	
	Agencyowner findByOwnermailAndOwnerpassword(String mail,String password);

}
