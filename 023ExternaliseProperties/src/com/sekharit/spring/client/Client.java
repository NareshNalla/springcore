package com.sekharit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sekharit.spring.bean.DBPropertiesBean;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sekharit/spring/config/spring.xml");
		DBPropertiesBean bean=
                        context.getBean("dbpropsref", DBPropertiesBean.class);
		bean.displayInjectedValues();
	}
}
