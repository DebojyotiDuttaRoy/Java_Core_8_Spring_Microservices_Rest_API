package com.stream;

public class Student {

	private String name;
	private double marks;
	private Subjects sub;
	
	public Student(String name, Subjects sub, double marks) {
		super();
		this.name = name;
		this.marks = marks;
		this.sub = sub;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public Subjects getSub() {
		return sub;
	}

	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", marks=" + marks + ", sub=" + sub + "]";
	}
	
	
}