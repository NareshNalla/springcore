package com.sekharit.spring.bean;

import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

	private Date date;
	public String shape;

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public DrawEvent(Object object) {
		super(object);
	}
	
	@Override
	public String toString() {
		return "shape : "+shape+ " drawn on :"+date;
	}
}
