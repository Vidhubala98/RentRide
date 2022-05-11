package com.cab.model;

public class Customer {
	private int customerNo;
	private String customerName;
	private String phoneNumber;
	private String emailId;
	private String doorNo;
	private String street;
	private String city;
	private String zipcode;
	private double dropLocation;
	private double fare;
//	Car car;
	
	
	public Customer(double dropLocation) {
		super();
		
		this.dropLocation = dropLocation;
	}

	public Customer(int customerNo, String customerName, String phoneNumber, String emailId, String doorNo,
			String street, String city, String zipcode) {
		super();
		this.customerNo = customerNo;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Customer [customerNo=" + customerNo + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", zipcode="
				+ zipcode + "]";
	}
	
	
}
