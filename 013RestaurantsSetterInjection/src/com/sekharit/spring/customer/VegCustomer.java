package com.sekharit.spring.customer;

import com.sekharit.spring.contract.Customer;
import com.sekharit.spring.contract.Menu;

public class VegCustomer implements Customer {

	private Menu menu;

	public VegCustomer() {
		System.out.println("VegCustomer()");
	}

	public VegCustomer(Menu menu) {
		System.out.println("VegCustomer(Menu menu)");
		this.menu = menu;
	}

	public void setMenu(Menu menu) {
		System.out.println("VegCustomer.setMenu(Menu menu)");
		this.menu = menu;
	}

	@Override
	public void getFoodService() {
		menu.getVegSerivice();
	}
}
