package com.company;

class Circle {
	String Id = "Circle";
	public int radius;

	Circle() {
		System.out.println("I am non param of circle");
	}

	Circle(int r) {
		System.out.println("I am circle parameterized constructor");
		this.radius = r;
	}

	public double area() {
		return Math.PI * this.radius * this.radius;
	}
}

class Cylinder1 extends Circle {
	public int height;

	Cylinder1(int r, int h) {
		super(r);
		System.out.println("I am cylinder1 parameterized constructor");
		this.height = h;
	}

	public double volume() {
		return Math.PI * this.radius * this.radius * this.height;
	}
}

public class cwh_52_ch10ps {
	public static void main(String[] args) {
		// Problem 1
		Circle vc = new Circle();
		System.out.println(vc.Id);
		Circle objC = new Circle(12);
		double ar = objC.area();
		System.out.println(ar);
		Cylinder1 obj = new Cylinder1(12, 4);
		double vol = obj.volume();
		System.out.println(vol);
	}
}
