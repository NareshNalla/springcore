package com.sekharit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InjectionTestRight {
	private static BeanFactory factory = new XmlBeanFactory(
			new ClassPathResource("spring-right.xml"));

	public static void main(String[] args) {
		Employee employee = (Employee) factory.getBean("employee");
		employee.showInjectedValues();
	}
}
