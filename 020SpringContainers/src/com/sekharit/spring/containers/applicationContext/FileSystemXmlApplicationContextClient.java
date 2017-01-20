package com.sekharit.spring.containers.applicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextClient {
	private static ApplicationContext context = new FileSystemXmlApplicationContext(
			"E:/SekharReddy/Spring/workspace/020SpringContainers/src/spring.xml");

	public static void main(String[] args) {
		System.out.println(context.getBean("springBean"));

	}

}
