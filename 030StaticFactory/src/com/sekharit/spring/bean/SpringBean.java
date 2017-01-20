package com.sekharit.spring.bean;

public class SpringBean {
	private SpringBean () {
		System.out.println("SpringBean()");
	}

	public static SpringBean newInstance() {
		System.out.println("SpringBean.newInstance()");
		return new SpringBean();
	}

	public void businessMethod() {
		System.out.println("SpringBean.businessMethod()");
	}
}
