package com.sekharit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sekharit.spring.bean.SpringBean;
import com.sekharit.spring.bean.SpringBeanTwo;

public class ClientTwo {

	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			"com/sekharit/spring/config/springTwo.xml");

	public static void main(String[] args) {
		SpringBeanTwo springBean = context.getBean("springBeanId",
				SpringBeanTwo.class);
		springBean.businessMethod();
	}
}
