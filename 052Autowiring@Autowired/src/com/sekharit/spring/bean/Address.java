package com.sekharit.spring.bean;

import org.springframework.beans.factory.annotation.Value;

public class Address {
//	@Value("hyd")
	private String city;
//	@Value("34343")
	private String pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	// getters & setters

}