package com.defaultMethod;
/*
public class C implements A, B{	
	@Override
	public void show() {
		System.out.println("Previously created C class which inherited A and B.");
	}
}	*/
public interface C extends A, B{
	/*
	@Override
	void show();	*/
	@Override
	default void show() {
		System.out.println("Collision solved");
	}
}

