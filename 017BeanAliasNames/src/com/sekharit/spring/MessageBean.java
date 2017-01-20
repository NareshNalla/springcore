package com.sekharit.spring;

public class MessageBean {
	private String message;

	public MessageBean() {
	}

	public MessageBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void showInjectedValue() {
		System.out.println("Injected message : " + message);
	}
}
