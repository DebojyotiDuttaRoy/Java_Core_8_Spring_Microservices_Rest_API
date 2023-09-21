package com.company;

class Cylinder {
	private int radius;
	private int height;

	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double surfaceArea() {
		return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
	}

	public double volume() {
		return Math.PI * radius * radius * height;
	}
}

class Rectangle {
	private int length;
	private int breadth;

	public void setLength(int l) {
		this.length = l;
	}

	public void setBreadth(int b) {
		this.breadth = b;
	}

	public Rectangle() {
		this.length = 4;
		this.breadth = 5;
		System.out.println("The default area of the rectangle is " + (length * breadth));
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}
}

public class cwh_44_ps09 {
	public static void main(String[] args) {
		// Problem 1
		Cylinder myCylinder = new Cylinder(1, 1);
		myCylinder.setHeight(12);
		myCylinder.setRadius(9);
		System.out.println(myCylinder.getHeight());
		System.out.println(myCylinder.getRadius());

		// Problem 2
		System.out.println(myCylinder.surfaceArea());
		System.out.println(myCylinder.volume());

		// Problem 3
		Rectangle r1 = new Rectangle();
		r1.setLength(10);
		r1.setBreadth(20);
		System.out.println(r1.getLength());
		System.out.println(r1.getBreadth());
		Rectangle r = new Rectangle(12, 56);
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
	}
}
