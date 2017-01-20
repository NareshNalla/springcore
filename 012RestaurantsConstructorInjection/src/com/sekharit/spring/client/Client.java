package com.sekharit.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sekharit.spring.contract.Customer;

public class Client {
	private static BeanFactory factory = new XmlBeanFactory(
			new ClassPathResource("spring.xml"));

	public static void main(String[] args) {
		Customer customer = (Customer) factory.getBean("customer");
		customer.getFoodService();
	}
}
