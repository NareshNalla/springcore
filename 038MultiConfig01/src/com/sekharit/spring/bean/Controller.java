package com.sekharit.spring.bean;

public class Controller {
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}

	public void controllerMethod() {
		System.out.println("Controller.controllerMethod()");
		service.serviceMethod();
	}
}
