package com.cab.model;

public class Driver {
	private String driverName;
	private double rating;
	private double distance;
	private double billAmount;
	
	Car car;
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Driver(String driverName, double rating, double distance, Car car) {
		super();
		this.driverName = driverName;
		this.rating = rating;
		this.distance = distance;
		this.car = car;
	}

	
	
	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", rating=" + rating + ", distance=" + distance + ", car=" + car + "]";
	}
	
	
}
