package com.cab.service;

import com.cab.model.Customer;
import com.cab.model.Driver;

public class CustomerService {
	
	final double CHARGE = 8;	
	DriverService driverService;
	
	public CustomerService(DriverService driverService) {
		super();
		this.driverService = driverService;
	}

	public Driver bookCar(double rideDistance,String carModel) {
		Driver d = driverService.getDriver(carModel);
		if(!d.equals(null)) {
			d.setBillAmount(calculateFare(rideDistance));
			return d;
		}
	 return null;	
	}
	
	public double calculateFare(double distance) {
		double dist = distance/1000;
		return CHARGE*dist;
	}
}
