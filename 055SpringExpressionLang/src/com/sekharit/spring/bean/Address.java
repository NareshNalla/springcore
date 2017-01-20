package com.sekharit.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressBean")
public class Address {

	@Value("Prasantha Nilayam Street")
	private String street;

	@Value("515154")
	private int postcode;

	@Value("India")
	private String country;

	public String getFullAddress(String prefix) {

		return prefix + " : " + street + " " + postcode + " " + country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
