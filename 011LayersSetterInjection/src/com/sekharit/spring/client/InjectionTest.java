package com.sekharit.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sekharit.spring.controller.Controller;
import com.sekharit.spring.controller.ControllerImpl;
import com.sekharit.spring.dao.DAOImpl;
import com.sekharit.spring.service.ServiceImpl;

public class InjectionTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		Controller controller = (Controller) factory.getBean("controllerId");
		controller.controllerMethod();

		// DAOImpl daoImpl = new DAOImpl();
		// ServiceImpl serviceImpl = new ServiceImpl(daoImpl);
		//	ControllerImpl impl = new ControllerImpl(serviceImpl);
	}
}
