package com.vidvaan.before.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NetworkUtilizer {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("com/vidvaan/before/spring/spring.xml");
		
		NetworkProvider provider = (NetworkProvider)container.getBean("networkProvider");
		provider.call();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();
		provider.sms();

	}
}
