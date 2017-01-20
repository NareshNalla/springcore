package com.sekharit.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public void employeeServiceMethod() {
		System.out.println("EmployeeService.employeeServiceMethod()");
		employeeDAO.employeeDAOMethod();
	}
}
