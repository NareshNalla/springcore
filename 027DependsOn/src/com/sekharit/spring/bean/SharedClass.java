package com.sekharit.spring.bean;

public class SharedClass {
	private static int amount;

	public static int getAmount() {
		return amount;
	}

	public static void setAmount(int aAmount) {
		amount = aAmount;
	}

}
