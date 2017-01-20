package com.sekharit.spring.customer;

import com.sekharit.spring.contract.Customer;
import com.sekharit.spring.contract.Menu;

public class NonVegCustomer implements Customer {
	private Menu menu;

	public NonVegCustomer() {
		System.out.println("NonVegCustomer()");
	}

	public NonVegCustomer(Menu menu) {
		System.out.println("NonVegCustomer(Menu menu)");
		this.menu = menu;
	}

	public void setMenu(Menu menu) {
		System.out.println("NonVegCustomer.setMenu(Menu menu)");
		this.menu = menu;
	}

	@Override
	public void getFoodService() {
		menu.getNonVegService();
	}
}
