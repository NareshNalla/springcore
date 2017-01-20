package com.sekharit.spring.bean;

import org.springframework.context.MessageSource;

public class Circle implements Shape {
	private Point center;
	private MessageSource messageSource;

	public void setCenter(Point center) {
		this.center = center;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void draw() {

//	System.out.println("Drawing Circle...with the following point");
//	System.out.println("Center(x=" + center.getX() + ", y=" + center.getY()	+ ")");
		System.out.println(messageSource.getMessage("circle.message", null,  null));
		System.out.println(messageSource.getMessage("point.message", new Object[]{center.getX(), center.getY()},  null));
		System.out.println(messageSource.getMessage("message.notexist", null,  "defalut message",  null));
		
	}
}
