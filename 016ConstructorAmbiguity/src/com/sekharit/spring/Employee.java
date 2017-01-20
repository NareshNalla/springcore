package com.sekharit.spring;

public class Employee {
	private int eno = 1;
	private String name = "none";
	private double salary = 0.0;
	private String desig = "clerk";

	public Employee(int eno, String name) {
		this.eno = eno;
		this.name = name;
	}

	public Employee(double salary, String desig) {
		this.salary = salary;
		this.desig = desig;
	}

	public void showInjectedValues() {
		System.out.println("Eno : " + eno);
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
		System.out.println("desig : " + desig);
	}
}
