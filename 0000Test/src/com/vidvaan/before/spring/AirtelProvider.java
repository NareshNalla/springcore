package com.vidvaan.before.spring;

public class AirtelProvider implements NetworkProvider {

	public void call() {
		System.out.println("airtel call");
	}

	public void sms() {
		System.out.println("airtel SMS");
	}
}
