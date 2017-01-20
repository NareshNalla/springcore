package com.sekharit.spring.service;

import com.sekharit.spring.dao.DAO;

public class ServiceImpl implements Service {
	private DAO dao;

	public ServiceImpl() {
		System.out.println("ServiceImpl()");
	}

	public ServiceImpl(DAO dao) {
		System.out.println("ServiceImpl(DAO dao)");
		this.dao = dao;
	}

	public void setDao(DAO dao) {
		System.out.println("ServiceImpl.setDao(DAO dao)");
		this.dao = dao;
	}

	public void serviceMethod() {
		System.out.println("ServiceImpl.serviceMethod()");
		dao.daoMethod();
	}
}