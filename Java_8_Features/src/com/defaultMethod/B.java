package com.defaultMethod;

public interface B {
	//void show();
	default void show() {System.out.println("I am B");}
}
