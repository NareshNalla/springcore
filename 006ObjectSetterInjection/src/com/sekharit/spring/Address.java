package com.sekharit.spring;

public class Address {
	private String hno;
	private String city;
	private int pincode;

	public Address() {
		System.out.println("Address()");
	}

	public Address(String hno, String city, int pincode) {
		System.out.println("Address(String hno, String city, int pincode)");
		this.hno = hno;
		this.city = city;
		this.pincode = pincode;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		System.out.println("Address.setHno(String hno)");
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Address.setCity(String city)");
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
