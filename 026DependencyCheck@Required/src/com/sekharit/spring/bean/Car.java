package com.sekharit.spring.bean;

import org.springframework.beans.factory.annotation.Required;

public class Car {
	private String breaks;
	private String driver;
	private AC ac;

	@Required
	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}

//	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}

//	@Required
	public void setAc(AC ac) {
		this.ac = ac;
	}

	public void move() {
		if (driver != null) {
			System.out.println("Driver is driving the car");
		} else {
			System.out.println("Owner is driving the car");
		}

		System.out.println("old man come across the road");
		System.out.println("apply breaks.... ");
		if (breaks != null) {
			System.out.println("old man saved");
		} else {
			System.out.println("kicked the bucket");
		}

		if (ac != null) {
			System.out.println("Nice car for summer");
		} else {
			System.out.println("Nice car for winter");
		}
	}

}
