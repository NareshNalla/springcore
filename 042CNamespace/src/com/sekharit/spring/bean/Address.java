package com.sekharit.spring.bean;

import java.beans.ConstructorProperties;

public class Address {
	private String city;
	private String hno;
	
	@ConstructorProperties( { "cityName", "houseNumber" })
	public Address(String city, String hno) {
		this.city = city;
		this.hno = hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getHno() {
		return hno;
	}
}
