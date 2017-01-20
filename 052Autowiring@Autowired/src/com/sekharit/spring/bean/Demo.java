package com.sekharit.spring.bean;

import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {

	public Demo() {
		System.out.println("Demo()");
	}
}
