package com.cab.service;

import java.util.ArrayList;
import java.util.Collections;

import com.cab.model.Car;
import com.cab.model.Driver;

public class DriverService {

	
	ArrayList<Driver> driversList = new ArrayList<>();
	
	
	
	public DriverService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DriverService(ArrayList<Driver> driversList) {
		super();
		this.driversList = driversList;
	}
	
	public ArrayList<Driver> getDriversList() {
		return driversList;
	}

	public Driver getDriver(String carModel) {
//		System.out.println("Get driver"+getDriversList());
		ArrayList<Driver> drivers = getDrivers(driversList);
		for(Driver d : drivers) {
			if(d.getRating()>=4 && d.getCar().getCarModel().equalsIgnoreCase(carModel)) {
				return d;
			}
		}
		return null;
	}

	public void addDrivers(ArrayList<Driver> driverList) {
		driversList.addAll(driverList);
	}
	
	public ArrayList<Driver> getDrivers(ArrayList<Driver> driverList) {
	//	System.out.println("Get drivers"+driverList);
		driverList = sortByDistance(driverList);
		return driverList;
	}
	
	public ArrayList<Driver> sortByDistance(ArrayList<Driver> driverList) {
		Collections.sort(driverList,new SortByDistance());
		return driverList;
	}
	
	
}
