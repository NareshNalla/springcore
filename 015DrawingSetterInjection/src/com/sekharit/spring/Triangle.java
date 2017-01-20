package com.sekharit.spring;

public class Triangle implements Shape {
	private Point pointOne;
	private Point pointTwo;
	private Point pointThree;

	public Triangle() {
		System.out.println("Triangle()");
	}

	public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
		System.out
				.println("Triangle(Point pointOne, Point pointTwo, Point pointThree)");
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
	}

	public void setPointOne(Point pointOne) {
		System.out.println("Point.setPointOne(Point pointOne)");
		this.pointOne = pointOne;
	}

	public void setPointTwo(Point pointTwo) {
		System.out.println("Point.setPointTwo(Point pointTwo)");
		this.pointTwo = pointTwo;
	}

	public void setPointThree(Point pointThree) {
		System.out.println("Point.setPointThree(Point pointThree)");
		this.pointThree = pointThree;
	}

	@Override
	public void draw() {
	    System.out.println("Drawing Triangle...with following points");
	    System.out.println("PointOne(x="+pointOne.getX()+", y="+ pointOne.getY()+")");
	    System.out.println("pointTwo(x="+ pointTwo.getX()+",y="+ pointTwo.getY() +")");
	    System.out.println("pointThree(x="+pointThree.getX()+",y="+pointThree.getY()+ ")");
	}
}
