package com.sekharit.spring.bean;

public abstract class A {
	private B b;

	public A() {
		System.out.println("A()");
	}

	public abstract B getBInstance();
}
