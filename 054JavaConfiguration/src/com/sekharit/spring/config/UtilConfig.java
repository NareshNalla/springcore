package com.sekharit.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sekharit.spring.bean.EmployeeUtil;

@Configuration
public class UtilConfig {
	@Bean
	public EmployeeUtil empUtil() {
		return new EmployeeUtil();
	}

}
