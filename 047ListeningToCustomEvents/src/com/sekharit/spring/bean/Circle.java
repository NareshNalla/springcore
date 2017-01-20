package com.sekharit.spring.bean;

import java.util.Date;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Circle implements ApplicationEventPublisherAware {
	private Point point;
	private ApplicationEventPublisher publisher;

	public void setPoint(Point point) {
		this.point = point;
	}

	public void draw() {
		System.out.println("Circle is drawing with the following point");
		System.out.println("Point(x=" + point.getX() + " y=" + point.getX()+ ")");
		DrawEvent drawEvent = new DrawEvent(this);
		drawEvent.setShape("Cricle");
		drawEvent.setDate(new Date());
		publisher.publishEvent(drawEvent);
	}

	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;

	}
}
