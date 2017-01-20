package com.sekharit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//We can define alias names with “name” attribute of <bean> tag or <alias> name tag.

public class Client {
	private static BeanFactory factory = new XmlBeanFactory(
			new ClassPathResource("spring.xml"));

	public static void main(String[] args) {
		MessageBean messageBean = (MessageBean) factory.getBean("messageBean");
		messageBean.showInjectedValue();
		// Even we can get the bean instance from container with alias name
		messageBean = (MessageBean) factory.getBean("mb1");
		messageBean.showInjectedValue();

		messageBean = (MessageBean) factory.getBean("mb4");
		messageBean.showInjectedValue();

		System.out.println("Alias names of 'messageBean' are...");
		String[] aliasNames = factory.getAliases("messageBean");
		for (String aliasName : aliasNames) {
			System.out.println(aliasName);
		}
	}
}
