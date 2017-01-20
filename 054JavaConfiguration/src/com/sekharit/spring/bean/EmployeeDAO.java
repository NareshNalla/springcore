package com.sekharit.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDAO {

	@Autowired
	private EmployeeUtil employeeUtil;

	@Autowired
	private EmployeeDetails employeeDetails;

	public void init() {
		System.out.println("EmployeeDAO.init()");
	}

	public void employeeDAOMethod() {
		System.out.println("EmployeeDAO.employeeDAOMethod()");
		employeeUtil.utilMethods();
		employeeDetails.printDetails();
	}

}
