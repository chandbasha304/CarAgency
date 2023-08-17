package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RentalAgencyApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(RentalAgencyApplication.class, args);
		int objectcount = run.getBeanDefinitionCount();
		System.out.println(objectcount+"Dependencies Autoconfigured By Spring Boot");    
	}

}
 