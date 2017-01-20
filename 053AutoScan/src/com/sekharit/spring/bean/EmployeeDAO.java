package com.sekharit.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
@Scope("singleton")
public class EmployeeDAO {

	@Value("scott")
	private String userName;
	@Value("tiger")
	private String password;

	public void employeeDAOMethod() {
		System.out.println("EmployeeDAO.employeeDAOMethod()");
		System.out.println("userName : " + userName);
		System.out.println("password : " + password);
	}

}
