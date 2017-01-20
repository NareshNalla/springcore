package com.sekharit.spring;

public class Employee {
	private int eno;
	private String name;
	private Address address;

	public Employee() {
		System.out.println("Employee()");
	}

	public Employee(int eno, String name, Address address) {
		System.out.println("Employee(int eno, String name, Address address)");
		this.eno = eno;
		this.name = name;
		this.address = address;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		System.out.println("Employee.setEno(int eno)");
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Employee.setName(String name)");
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
