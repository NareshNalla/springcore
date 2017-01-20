package com.sekharit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sekharit.spring.bean.EmployeeService;
import com.sekharit.spring.config.ApplicationConfig;

public class Client {
	private static ApplicationContext context = new AnnotationConfigApplicationContext(
			ApplicationConfig.class);

	public static void main(String[] args) {
		EmployeeService employeeService = context.getBean("empService",
				EmployeeService.class);
		employeeService.employeeServiceMethod();
	}

}
