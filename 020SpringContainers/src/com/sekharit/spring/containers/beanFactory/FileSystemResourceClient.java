package com.sekharit.spring.containers.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class FileSystemResourceClient {
	private static BeanFactory beanFactory = new XmlBeanFactory(
			new FileSystemResource("E:/SekharReddy/Spring/ioc-new-ws/020SpringContainers/src/spring.xml"));

		public static void main(String[] args) {
			System.out.println(beanFactory.getBean("springBean"));

		}

}
