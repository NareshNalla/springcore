package com.sekharit.spring.controller;

import com.sekharit.spring.service.Service;

public class ControllerImpl implements Controller {
	private Service service;

	public ControllerImpl() {
		System.out.println("ControllerImpl()");
	}

	public ControllerImpl(Service service) {
		System.out.println("ControllerImpl(Service service)");
		this.service = service;

	}

	public void setService(Service service) {
		System.out.println("ControllerImpl.setService(Service service)");
		this.service = service;
	}

	@Override
	public void controllerMethod() {
		System.out.println("ControllerImpl.controllerMethod()");
		service.serviceMethod();
	}
}
