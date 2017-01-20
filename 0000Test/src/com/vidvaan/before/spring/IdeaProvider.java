package com.vidvaan.before.spring;

public class IdeaProvider implements NetworkProvider {
	public void call() {
		System.out.println("idea call");
	}

	public void sms() {
		System.out.println("idea SMS");
	}
}
