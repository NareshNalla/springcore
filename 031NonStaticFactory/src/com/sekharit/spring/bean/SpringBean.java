package com.sekharit.spring.bean;

import java.util.Date;

public class SpringBean {
	public SpringBean() {
		System.out.println("SpringBean()");
	}

	public Date createDateInstance() {
		System.out.println("SpringBean.createDateInstance()");
		return new Date();
	}
}
