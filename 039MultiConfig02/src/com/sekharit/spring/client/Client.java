package com.sekharit.spring.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sekharit.spring.bean.Controller;
public class Client {
	private static String[] configs = {
			"com/sekharit/spring/config/spring-controller-config.xml",
			"com/sekharit/spring/config/spring-service-config.xml",
			"com/sekharit/spring/config/spring-dao-config.xml" };
	private static ApplicationContext context = new 
                                    ClassPathXmlApplicationContext(configs);

	public static void main(String[] args) {
		Controller controller = (Controller) context.getBean("controllerref");
		controller.controllerMethod();

	}
}
