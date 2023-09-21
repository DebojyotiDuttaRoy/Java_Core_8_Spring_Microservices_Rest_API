package com.defaultMethod;

public interface Vechicles {
	default void horn() {
		System.out.println("Poo Poo Poo . . .");
	}
	//after 5 years new method is requested by client
	default void speedMeter() {
		System.out.println("90 kmph");
	}
	/*
	static void speedMeter() {
		System.out.println("90 kmph");
	}	*/
}
 