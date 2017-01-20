package com.sekharit.spring.bean;

public class DepositAmount {

	/** Creates a new instance of DepositAmount */
	public DepositAmount() {
		System.out.println("Before Depositing : " + SharedClass.getAmount());
		SharedClass.setAmount(SharedClass.getAmount() + 100);
		System.out.println("After Depositing : " + SharedClass.getAmount());
	}

}
