package com.sekharit.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InjectionTest {
	private static BeanFactory container = new XmlBeanFactory(
			new ClassPathResource("applicationContext.xml"));

	public static void main(String[] args) {

		Employee employee = (Employee) container.getBean("employeeId");
		System.out.println("Employee Bean and Its dependency bean details...");
		System.out.println("Eno: " + employee.getEno());
		System.out.println("Name : " + employee.getName());
		System.out.println("Hno : " + employee.getAddress().getHno());
		System.out.println("City :" + employee.getAddress().getCity());
		System.out.println("Pincode : " + employee.getAddress().getPincode());

		System.out.println("Address Bean and Its dependency bean details...");
		Address address = (Address) container.getBean("addressId");
		System.out.println("Hno : " + address.getHno());
		System.out.println("City :" + address.getCity());
		System.out.println("Pincode : " + address.getPincode());

	}
}
