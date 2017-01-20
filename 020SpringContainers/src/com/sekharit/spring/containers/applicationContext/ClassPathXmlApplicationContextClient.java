package com.sekharit.spring.containers.applicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextClient {
	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			"spring.xml");

	public static void main(String[] args) {
//		 System.out.println(context.getBean("springBean"));

	}

}
