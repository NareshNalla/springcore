package com.sekharit.spring.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sekharit/spring/config/spring.xml");
		// Let us raise a start event.
		context.start();

		// Let us raise a stop event.
		context.stop();
	}

}
