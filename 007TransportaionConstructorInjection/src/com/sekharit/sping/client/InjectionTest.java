package com.sekharit.sping.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sekharit.sping.customer.TravelsCustomer;

public class InjectionTest {
	private static BeanFactory factory = new XmlBeanFactory(
			new ClassPathResource("applicationContext.xml"));

	public static void main(String[] args) {
		TravelsCustomer customer = (TravelsCustomer) factory
				.getBean("travelsCustomer");
		customer.useTransport();
	}
}
