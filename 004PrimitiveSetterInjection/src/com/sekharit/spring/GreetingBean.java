package com.sekharit.spring;

public class GreetingBean {
	private String name;

	public GreetingBean() {
		System.out.println("GreetingBean()");
	}

	public GreetingBean(String name) {
		System.out.println("GreetingBean(String name)");
		this.name = name;
	}

	public void setName(String name) {
		System.out.println("GreetingBean.setName(String name)");
		this.name = name;
	}

	public void printInjectedValue() {
		System.out.println("name : " + name);
	}

}
