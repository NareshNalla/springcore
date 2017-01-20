package com.sekharit.sping.provider;

import com.sekharit.sping.contract.Travels;

public class KesineniTravels implements Travels {
	public KesineniTravels() {
		System.out.println("KesineniTravels()");
	}

	public void doTravel() {
		System.out
				.println("this is very best KesineniTravels, have a nice journey");
	}
}
