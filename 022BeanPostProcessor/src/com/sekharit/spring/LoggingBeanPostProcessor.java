package com.sekharit.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LoggingBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("\nLoggingBeanPostProcessor.postProcessBeforeInitialization(Object bean, String beanName)");
		System.out.println("bean : " + bean.getClass());
		System.out.println("beanName : " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("\nLoggingBeanPostProcessor.postProcessAfterInitialization(Object bean, String beanName)");
		System.out.println("bean : " + bean.getClass());
		System.out.println("beanName : " + beanName);
		return bean;
	}
}
