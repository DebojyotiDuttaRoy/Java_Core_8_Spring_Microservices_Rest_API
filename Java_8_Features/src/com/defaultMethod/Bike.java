package com.defaultMethod;

public class Bike implements Vechicles, C{
	
		@Override
		public void horn() {
			System.out.println("Pee Pee . . . .");
		}
		
		@Override
		public void speedMeter() {
			System.out.println("100 kmph");
		}
		
		@Override
		public void show() {
			System.out.println("The Collision solving method is learned by us.");
		}
}
