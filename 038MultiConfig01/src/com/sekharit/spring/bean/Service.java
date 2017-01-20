package com.sekharit.spring.bean;

public class Service {
	private DAO dao;

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public void serviceMethod() {
		System.out.println("Service.serviceMethod()");
		dao.daoMethod();
	}
}
