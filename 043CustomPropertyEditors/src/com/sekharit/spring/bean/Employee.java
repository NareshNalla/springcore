package com.sekharit.spring.bean;

import java.util.Date;

public class Employee {
	private int eno;
	private String name;
	private double salary;
	private ContactNumber contactNumber;
	private Date dateOfBirth;

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setContactNumber(ContactNumber contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void displayInjectedValues() {
		System.out.println("eno : " + eno);
		System.out.println("ename : " + name);
		System.out.println("salary : " + salary);
		System.out.println("conatact : " + contactNumber.getCountryCode() + "-"	+ contactNumber.getStateCode() + "-" + contactNumber.getNumber());
		System.out.println("dateOfBirth : " + dateOfBirth);
	}

}
