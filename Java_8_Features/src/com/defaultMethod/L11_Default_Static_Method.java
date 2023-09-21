package com.defaultMethod;

public class L11_Default_Static_Method {

	public static void main(String[] args) {
		Vechicles vechicles=new Car();
		vechicles.horn();
		vechicles.speedMeter();
//		Vechicles.speedMeter();
		
		vechicles=new Bike();
		vechicles.horn();
		vechicles.speedMeter();
//		Vechicles.speedMeter();

	}

}
