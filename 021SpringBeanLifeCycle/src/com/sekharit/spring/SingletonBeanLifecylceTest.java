package com.sekharit.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonBeanLifecylceTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"singleton-spring.xml");

		// register a shutdown hook
		context.registerShutdownHook();

		// Taking spring bean from the container
		MessageBean messageBean = context.getBean("messageBeanSingleton",
				MessageBean.class);

		// Taking the same spring bean again from the container
		messageBean = context
				.getBean("messageBeanSingleton", MessageBean.class);

		// calling the business method on the spring bean
		messageBean.displayInjectedValue();

		// physically closing the continer
		// context.close();

	}
}
