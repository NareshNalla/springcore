package com.sekharit.spring.provider;

import com.sekharit.spring.contract.Menu;

public class ParadiseRestaurant implements Menu {
	public ParadiseRestaurant() {
		System.out.println("ParadiseRestaurant()");
	}

	@Override
	public void getVegSerivice() {
		System.out.println("ParadiseRestaurant worst veg service");
	}

	@Override
	public void getNonVegService() {
		System.out.println("ParadiseRestaurant best non-veg service");
	}
}
