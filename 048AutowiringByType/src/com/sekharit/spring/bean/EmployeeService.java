package com.sekharit.spring.bean;

public class EmployeeService {
	private EmployeeDAO employeeDAO;

	public EmployeeService() {
		System.out.println("EmployeeService()");
	}

	public EmployeeService(EmployeeDAO employeeDAO) {
		System.out.println("EmployeeService(EmployeeDAO employeeDAO)");
		this.employeeDAO = employeeDAO;
	}

	public void setAbc(EmployeeDAO employeeDAO) {
		System.out.println("EmployeeService.setEmployeeDAO(EmployeeDAO employeeDAO)");
		this.employeeDAO = employeeDAO;
	}
	
	public void setXyz(Demo d){
		System.out.println("setXyz(Demo d)");
	}

	public void serviceMethod() {
		System.out.println("EmployeeService.serviceMethod()");
		employeeDAO.daoMethod();
	}
}
