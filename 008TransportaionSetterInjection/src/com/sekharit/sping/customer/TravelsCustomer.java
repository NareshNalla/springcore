package com.sekharit.sping.customer;

import com.sekharit.sping.contract.Travels;

public class TravelsCustomer {

	private Travels travels;

	public TravelsCustomer() {
		System.out.println("TravelsCustomer() ");
	}

	public TravelsCustomer(Travels travels) {
		System.out.println("TravelsCustomer(Travels travels)");
		this.travels = travels;
	}

	public void setTravels(Travels travels) {
		System.out.println("TravelsCustomer.setTravels(Travels travels)");
		this.travels = travels;
	}

	public void useTransport() {
		travels.doTravel();
	}
}
