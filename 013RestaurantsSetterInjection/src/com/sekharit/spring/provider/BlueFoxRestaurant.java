package com.sekharit.spring.provider;

import com.sekharit.spring.contract.Menu;

public class BlueFoxRestaurant implements Menu {

	public BlueFoxRestaurant() {
		System.out.println("BlueFoxRestaurant()");
	}

	@Override
	public void getVegSerivice() {
		System.out.println("BlueFoxRestaurant best veg service");
	}

	@Override
	public void getNonVegService() {
		System.out.println("BlueFoxRestaurant worst non-veg service");
	}

}
