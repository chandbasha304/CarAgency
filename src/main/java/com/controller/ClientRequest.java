package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.entity.BookedCars;
import com.entity.CarsDTO;
import com.service.BookingService;
import com.service.CarService;
import com.service.CustomerService;
import com.service.OwnerService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class ClientRequest {


	@Autowired
	CarService carInformation;

	@Autowired
	OwnerService ownerWork;


	@Autowired
	CustomerService customerwork;
	
	
	@Autowired
	BookingService bookingVehicles;


	@GetMapping("/car")
	public ModelAndView startProcess()
	{
		ModelAndView startview = new ModelAndView("start");
		return startview;
	}



	@GetMapping("/loginprocess")
	public ModelAndView loginProcess()
	{
		ModelAndView startview = new ModelAndView("loginfirststep");
		return startview;
	}

	@GetMapping("/registerprocess")
	public ModelAndView registerProcess()
	{
		ModelAndView startview = new ModelAndView("signupstep");
		return startview;
	}

	@PostMapping("/displaycars")
	public ModelAndView viewAvailableCars()
	{
		System.out.println("Controller Layer");
		List<CarsDTO> totalcars = carInformation.getdataFromRepo();
		for (CarsDTO carsDTO : totalcars) {
			System.out.println(carsDTO);

		}
		ModelAndView startview = new ModelAndView("displayallcars");
		startview.addObject("cars",totalcars);
		return startview;
	}




	@PostMapping("/submitregistration")
	public ModelAndView registrationSecondStep(HttpServletRequest data)
	{
		String confirm = data.getParameter("registrationType");
		System.out.println(confirm);
		if (confirm.equals("customer")) 
		{

			ModelAndView customerview = new ModelAndView("customersignup");
			return customerview;
		}
		else
		{
			ModelAndView ownerview = new ModelAndView("ownersignup");
			return ownerview;
		}


	}


	@PostMapping("/ownerdata")
	public ModelAndView ownerInformationAdding(HttpServletRequest data)
	{

		Boolean dataconfirm = ownerWork.ownerProcessInformation(data);
		if(dataconfirm)
		{

			ModelAndView ownerdata = new ModelAndView("ownersignupok");
			return ownerdata;

		}
		else
		{

			ModelAndView ownerdata = new ModelAndView("ownersignupfail");
			return ownerdata;
			}





	}

	@PostMapping("/customerdata")
	public ModelAndView customerInformationAdding(HttpServletRequest data)
	{

		Boolean dataconfirm = customerwork.customerInformationAdding(data);
		if(dataconfirm)
		{
			
			ModelAndView ownerdata = new ModelAndView("customersignupok");
			return ownerdata;
			
		}
		else
		{

			ModelAndView ownerdata = new ModelAndView("customersignupfail");
			return ownerdata;}


	}
	
	
	@PostMapping("nextsteps")
	public ModelAndView confirmingLoginProcess(HttpServletRequest data)
	{
		
		String confirm = data.getParameter("loginType");
		if(confirm.equals("owner"))
		{
			ModelAndView ownersign = new ModelAndView("ownerlogin");
			return ownersign;
		}
		else
		{
			ModelAndView customersignin = new ModelAndView("customerlogin");
			return customersignin;
		}
	}
	
	
	
	@PostMapping("customersignin")
	public ModelAndView customerLoginCheck(HttpServletRequest data)
	{
		
		Boolean confirmdata = customerwork.customerCredentialsFinding(data);
		
		if(confirmdata)
		{ 
			System.out.println(data.getParameter("customermail"));
			String usermail = data.getParameter("customermail");
			
			ModelAndView signinok = new ModelAndView("usersigninok");
			signinok.addObject("usermail",usermail);
			
			
			return signinok;
		}
		else
	
		{
			ModelAndView notok = new ModelAndView("usersigninfail");
			return notok;
		}
		
		
	}
	
	
	@PostMapping("ownersignin")
	public ModelAndView ownerLoginCheck(HttpServletRequest data)
	{
		
		Boolean ok = ownerWork.ownerCredentialsFinding(data);

		if(ok)
		{ 
			
			
			ModelAndView signinok = new ModelAndView("ownersigninok");
			return signinok;
		}
		else
	
		{
			ModelAndView notok = new ModelAndView("ownersigninfail");
			return notok;
		}
		
	}
	
	
	@GetMapping("addingcars")
	public ModelAndView addingCarsinDatabase(HttpServletRequest data)
	{
		
		ModelAndView modelAndView = new ModelAndView("addcars");
		return modelAndView;
		
	}
	
	
	@GetMapping("ownerlogout")
	public ModelAndView ownersLogout( )
	{
		
		ModelAndView modelAndView = new ModelAndView("start");
		return modelAndView;
		
	}
	
	@PostMapping("cardata")
	public ModelAndView newCarAdding(HttpServletRequest data)
	{
		Boolean confirming = carInformation.addcarData(data);
		if(confirming)
		{
			ModelAndView caradded = new ModelAndView("newcaradded");
			return caradded;
		}
		else
		{
			ModelAndView carnotAdded = new ModelAndView("carnotadded");
			return carnotAdded;
		}
		
	}
	
	
	
	

	@PostMapping("bookthecar")
	public ModelAndView customerBookinCar(HttpServletRequest data)
	{
		String modelCar = data.getParameter("vehiclemodel");
		String number = data.getParameter("vehiclenumber");
		String userBook = data.getParameter("customermail");
		System.out.println(modelCar);
		System.out.println(number);
		
		ModelAndView bookfirst = new ModelAndView("firstbook");
		
		bookfirst.addObject("carmodel",modelCar);
		bookfirst.addObject("carnumber",number);
		bookfirst.addObject("mail",userBook);
		
		return bookfirst;
		
	}
	
	@PostMapping("bookcarprocess")
	public ModelAndView customerBookinCarSecondStep(HttpServletRequest data)
	{
		BookedCars bookedFinally = bookingVehicles.bookingDataStartProcess(data);
		if(bookedFinally != null)
		{
			ModelAndView modelAndView = new ModelAndView("bookingok");
			modelAndView.addObject("userbookings",bookedFinally);
			return modelAndView;
		}
		
		
		
		else
		{
			return null;
		}
		
	}
	
	
	@PostMapping("/displaycarsfromuser")
	public ModelAndView viewAvailableCarstoUser(HttpServletRequest data)
	{
		
		String usermail = data.getParameter("usermail");
		System.out.println(usermail);
		System.out.println("Controller Layer");
		List<CarsDTO> totalcars = carInformation.getdataFromRepo();
		for (CarsDTO carsDTO : totalcars) {
			System.out.println(carsDTO);

		}
		ModelAndView startview = new ModelAndView("displaycarforusers");
		startview.addObject("cars",totalcars);
		startview.addObject("usermail",usermail);
		return startview;
	}
	
	
	
	@PostMapping("/bookedcarhistory")
	public ModelAndView viewBookedCarsToOwners( )
	{
		List<BookedCars> carsFromRepo = bookingVehicles.getCarsFromRepo();
		
		
		ModelAndView bookedcars = new ModelAndView("bookeddata");
		bookedcars.addObject("userbookings", carsFromRepo);
		
		return bookedcars;
	}



}
