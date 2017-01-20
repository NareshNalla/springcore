package com.sekharit.spring.bean;

import org.springframework.beans.factory.annotation.Value;

public class Job {
	@Value("sofwareEngineer")
	private String title;
	@Value("IT")
	private String department;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// getters & setters

}
