package com.sekharit.spring;

public class Point {
	private int x;
	private int y;

	public Point() {
		System.out.println("Point()");
	}

	public Point(int x, int y) {
		System.out.println("Point(int x, int y)");
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("Point.setX(int x)");
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		System.out.println("Point.setY(int y)");
		this.y = y;
	}

}
