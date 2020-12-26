package com.birichani.code.DistrictBuildingsManagementApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.birichani.code.DistrictBuildingsManagementApplication.controllers"})
public class DistrictBuildingsManagementApplication {
	
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(DistrictBuildingsManagementApplication.class,args); }

}
