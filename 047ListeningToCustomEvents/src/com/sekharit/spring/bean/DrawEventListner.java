package com.sekharit.spring.bean;

import org.springframework.context.ApplicationListener;

public class DrawEventListner implements ApplicationListener<DrawEvent> {
	@Override
	public void onApplicationEvent(DrawEvent event) {
		System.out.println(event);

	}
}
