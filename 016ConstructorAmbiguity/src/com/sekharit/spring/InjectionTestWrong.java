package com.sekharit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InjectionTestWrong {
	private static BeanFactory factory = new XmlBeanFactory(
			new ClassPathResource("spring-wrong.xml"));

	public static void main(String[] args) {
		Employee employee = (Employee) factory.getBean("employee");
		employee.showInjectedValues();
	}

}
