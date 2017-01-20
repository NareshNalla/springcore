package com.sekharit.spring.bean;

public class SpringBeanTwo {
	private SpringBeanTwo() {
		System.out.println("SpringBeanTwo()");
	}

	public static SpringBeanTwo newInstance(String arg) {
		System.out.println("SpringBeanTwo.newInstance()");
		System.out.println("arg : " + arg);
		return new SpringBeanTwo();
	}

	public void businessMethod() {
		System.out.println("SpringBeanTwo.businessMethod()");
	}
}
