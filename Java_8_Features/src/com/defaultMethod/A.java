package com.defaultMethod;

public interface A {
	//void show();
	default void show() {System.out.println("I am A");}
}
