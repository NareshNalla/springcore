package com.sekharit.spring.bean;

public class DBPropertiesBean {
	private String username;
	private String password;
	private String url;
	private String driverClass;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public void displayInjectedValues() {
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("url : " + url);
		System.out.println("driverClass : " + driverClass);

	}

}
