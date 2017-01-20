package com.sekharit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client {
	private static BeanFactory factory = new XmlBeanFactory(
			new ClassPathResource("spring.xml"));

	public static void main(String[] args) {
		System.out.println("object 1--> "+factory.getBean("springBean"));
		System.out.println("object 2--> "+factory.getBean("springBean"));
		System.out.println("object 3--> "+factory.getBean("springBean"));
	}
}
