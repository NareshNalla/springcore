package com.sekharit.spring;

public class Circle implements Shape {
	private Point center;

	public Circle() {
		System.out.println("Circle()");
	}

	public Circle(Point center) {
		System.out.println("Circle(Point center)");
		this.center = center;
	}

	public void setCenter(Point center) {
		System.out.println("Point.setCenter(Point center)");
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle...with the following point");
		System.out.println("Center(x=" + center.getX() + ", y=" + center.getY()
				+ ")");
	}
}
