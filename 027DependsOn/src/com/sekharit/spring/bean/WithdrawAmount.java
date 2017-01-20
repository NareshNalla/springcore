package com.sekharit.spring.bean;

public class WithdrawAmount {

	/** Creates a new instance of WithdrawAmount */
	public WithdrawAmount() {
		System.out.println("Before Withdrawal : " + SharedClass.getAmount());
		SharedClass.setAmount(SharedClass.getAmount() - 100);
		System.out.println("After Withdrawal :" + SharedClass.getAmount());
	}

}
