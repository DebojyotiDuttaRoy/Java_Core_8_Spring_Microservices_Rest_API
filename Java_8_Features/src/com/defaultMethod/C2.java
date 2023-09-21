package com.defaultMethod;

public class C2 implements A, B{	
	
	@Override
	public void show() {
		System.out.println("Running Previously created C class which inherited A and B.");
	}
}
