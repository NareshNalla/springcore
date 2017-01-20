package com.sekharit.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("empContr")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	public void employeeControllerMethod() {
		System.out.println("EmployeeController.employeeControllerMethod()");
		service.employeeServiceMethod();
	}
}
