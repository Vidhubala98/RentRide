package com.cab.service;

import java.util.Comparator;

import com.cab.model.Driver;

public class SortByDistance implements Comparator<Driver> {

	@Override
	public int compare(Driver o1, Driver o2) {
		return (int)o1.getDistance() - (int)o2.getDistance();
	}
	
	
}
