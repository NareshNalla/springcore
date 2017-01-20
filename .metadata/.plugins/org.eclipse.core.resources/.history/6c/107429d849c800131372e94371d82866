package com.sekharit.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import com.sekharit.spring.bean.EmployeeDAO;
import com.sekharit.spring.bean.EmployeeService;

@Configuration
@Import({ UtilConfig.class })
@ImportResource("classpath:com/sekharit/spring/config/spring.xml")
public class ApplicationConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope("singleton")
	// @Lazy
	public EmployeeDAO empDAO() {
		return new EmployeeDAO();
	}

	@Bean
	@Scope("singleton")
	public EmployeeService empService() {
		return new EmployeeService();
	}

}
