package com.sekharit.spring.bean;

import java.beans.ConstructorProperties;

public class Employee {
	private int eno;
	private String empName;
	private Address address;

	@ConstructorProperties( { "eno", "name", "address" })
	public Employee(int eno, String empName, Address address) {
		this.eno = eno;
		this.empName = empName;
		this.address = address;
	}

	public void displayDetails() {
		System.out.println("eno : " + eno);
		System.out.println("name : " + empName);
		System.out.println("city : " + address.getCity());
		System.out.println("hno : " + address.getHno());
	}
}
