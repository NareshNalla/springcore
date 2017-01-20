package com.sekharit.spring.bean;

public class Employee {
	private int eno;
	private String name;
	private Address address;

	public void setEno(int eno) {
		this.eno = eno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void displayDetails() {
		System.out.println("eno : " + eno);
		System.out.println("name : " + name);
		System.out.println("city : " + address.getCity());
		System.out.println("hno : " + address.getHno());
	}
}
