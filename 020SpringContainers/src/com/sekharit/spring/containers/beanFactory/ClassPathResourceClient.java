package com.sekharit.spring.containers.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClassPathResourceClient {
	private static BeanFactory beanFactory = new XmlBeanFactory(
			new ClassPathResource("spring.xml"));

	public static void main(String[] args) {
//		System.out.println(beanFactory.getBean("springBean"));

	}

}
