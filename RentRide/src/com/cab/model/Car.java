package com.cab.model;

public class Car {
	private String carModel;
	
	public Car(String carModel) {
		super();
		this.carModel = carModel;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	@Override
	public String toString() {
		return "Car [carModel=" + carModel +"]";
	}
	
	
}
