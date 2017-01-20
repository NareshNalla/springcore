package com.sekharit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sekharit.spring.bean.Child;

public class Client {
	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			"com/sekharit/spring/config/spring.xml");

	public static void main(String[] args) {
		Child child = context.getBean("child", Child.class);
		System.out.println("propertyDocs : " + child.getPropertyDocs());
		System.out.println("bankBalance : " + child.getBankBalance());
		System.out.println("deseases : " + child.getDeseases());
		System.out.println("badHabits : " + child.getBadHabits());
		System.out.println("knowledge : " + child.getKnowledge());
	}

}
