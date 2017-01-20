package com.sekharit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sekharit.spring.bean.Employee;

public class Client {
//	private static ApplicationContext context = new ClassPathXmlApplicationContext(
//			"com/sekharit/spring/config/spring.xml");

	 private static ApplicationContext context = new
	 ClassPathXmlApplicationContext(
	 "com/sekharit/spring/config/spring-parent.xml");
	// private static ApplicationContext context = new
	// ClassPathXmlApplicationContext(
	//		"com/sekharit/spring/config/spring-abstract.xml");

	public static void main(String[] args) {
		Employee employee1 = (Employee) context.getBean("emp1");
		employee1.displayEmpDetails();
		System.out.println();

		Employee employee2 = (Employee) context.getBean("emp2");
		employee2.displayEmpDetails();
		System.out.println();

		Employee employee3 = (Employee) context.getBean("emp3");
		employee3.displayEmpDetails();

	}
}
