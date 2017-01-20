package com.sekharit.spring.Utilizer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sekharit.spring.contract.Connection;

public class ConnectionUtilizer {
	private static BeanFactory factory = new XmlBeanFactory(
			new ClassPathResource("applicationContext.xml"));

	public static void main(String[] args) {

		Connection contract = (Connection) factory.getBean("provider");
		String connectionstring = contract.getConnection();
		System.out.println(connectionstring);
	}

}
