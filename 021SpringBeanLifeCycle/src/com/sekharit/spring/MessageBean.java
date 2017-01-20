package com.sekharit.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;

/**
 * this is the class which is used to explain spring bean life cycle<br/>
 * this has exmples of implementing life cycle using interfaces, xml and
 * annotions<br/>
 * 
 * @author sekhar
 * 
 */
public class MessageBean implements InitializingBean, DisposableBean,
		BeanNameAware, BeanFactoryAware, ApplicationContextAware {
	private String message;

	public MessageBean() {
		System.out.println("MessageBean()");
	}

	public MessageBean(String message) {
		System.out.println("MessageBean(String message)");
		this.message = message;
	}

	public void setMessage(String message) {
		System.out.println("MessageBean.setMessage(String message)");
		this.message = message;
	}

	@PostConstruct
	public void annotatedInit() {
		System.out.println("MessageBean.annotatedInit()");
	}

	public void configuredInit() {
		System.out.println("MessageBean.configuredInit()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet()");

	}

	public void displayInjectedValue() {
		System.out.println("Injected Value is : " + message);
	}

	@PreDestroy
	public void annotatedDestroy() {
		System.out.println("MessageBean.annotatedDestroy()");
	}

	public void configuredDestroy() {
		System.out.println("MessageBean.configuredDestroy()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy()");

	}

	// knowing spring bean name
	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware.setBeanName(String name) :" + name);

	}

	// In which container this spring bean is residing
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out
				.println("BeanFactoryAware.setBeanFactory(BeanFactory beanFactory)");
	}

	// In which container this spring bean is residing
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out
				.println("ApplicationContextAware.setApplicationContext (ApplicationContext applicationContext)");

	}
}
