package com.sekharit.spring.bean;

import java.util.Date;

public class SpringBeanTwo {
	public SpringBeanTwo() {
		System.out.println("SpringBeanTwo()");
	}

	public Date createDateInstance(String arg) {
		System.out.println("SpringBeanTwo.createDateInstance()");
		System.out.println("arg : "+arg);
		return new Date();
	}
}
