package com.sekharit.spring.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sekharit.spring.bean.A;

public class Client {
	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			"com/sekharit/spring/config/spring.xml");

	public static void main(String[] args) {
		A a=context.getBean("a",A.class);
		System.out.println("\na : " + a);
		System.out.println("b : "+a.getB());

		a = context.getBean("a", A.class);
		System.out.println("\na : " + a);
		System.out.println("b : "+a.getB());
		
		a = context.getBean("a", A.class);
		System.out.println("\na : " + a);
		System.out.println("b : "+a.getB());
		
		
	}

}
