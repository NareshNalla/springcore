package com.sekharit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sekharit.spring.bean.EmployeeController;
import com.sekharit.spring.bean.EmployeeService;

public class Client {
	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			"com/sekharit/spring/config/spring.xml");

	public static void main(String[] args) {

		EmployeeController  controller= context.getBean("empContr",
				EmployeeController.class);
		controller.employeeControllerMethod();

	}

}
