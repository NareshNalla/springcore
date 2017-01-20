package com.sekharit.sping.provider;

import com.sekharit.sping.contract.Travels;

public class DivakarTravels implements Travels {
	public DivakarTravels() {
		System.out.println("DivakarTravels()");
	}

	public void doTravel() {
		System.out.println("this is best DivakarTravels, happy journy");
	}
}
