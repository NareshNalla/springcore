package com.sekharit.spring.client;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			"com/sekharit/spring/config/spring.xml");

	public static void main(String[] args) {
		String message = context.getMessage("welcome.message", new Object[] {
				"US", "English" }, new Locale("en", "US", "SiliconValley"));
		System.out.println(message);
		message = context.getMessage("welcome.message", null, new Locale("zh",
				"CN"));
		System.out.println(message);
		message = context.getMessage("welcome.message", null, new Locale("tu"));
		System.out.println(message);
	}
}
