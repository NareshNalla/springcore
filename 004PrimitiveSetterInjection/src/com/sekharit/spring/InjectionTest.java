package com.sekharit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InjectionTest {
	private static BeanFactory factory = new XmlBeanFactory(
			new ClassPathResource("applicationContext.xml"));

	public static void main(String[] args) {
		GreetingBean bean = (GreetingBean) factory.getBean("greetingBean");
		bean.printInjectedValue();

	}

}
