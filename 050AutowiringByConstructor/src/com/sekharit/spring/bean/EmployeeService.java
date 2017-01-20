package com.sekharit.spring.bean;


public class EmployeeService {

	private EmployeeDAO employeeDAO;

	public EmployeeService() {
		System.out.println("EmployeeService()");
	}

	public EmployeeService(Demo demo) {
		System.out.println("EmployeeService(Demo demo)");
	}

	public EmployeeService(EmployeeDAO employeeDAO) {
		System.out.println("EmployeeService(EmployeeDAO employeeDAO)");
		this.employeeDAO = employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		System.out
				.println("EmployeeService.setEmployeeDAO(EmployeeDAO employeeDAO)");
		this.employeeDAO = employeeDAO;
	}

	public void serviceMethod() {
		System.out.println("EmployeeService.serviceMethod()");
		employeeDAO.daoMethod();
	}
}
