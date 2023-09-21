package com.company;

interface Bicycle {
	int a = 66;

	void applyBrake(int decrement);

	void speedUp(int increment);
}

interface HornBicycle {
	int x = 33;

	void blowHornK3g();

	void blowHorn2();
}

class AvonCycle implements Bicycle, HornBicycle {
	// public int x = 5;
	void blowHorn() {
		System.out.println("Pee Pee Poo Poo");
	}

	public void applyBrake(int decrement) {
		System.out.println("Applying Brake");
	}

	public void speedUp(int increment) {
		System.out.println("Applying SpeedUP");
	}

	public void blowHornK3g() {
		System.out.println("pee pee pee po po po");
	}

	public void blowHorn2() {
		System.out.println("Main hun naa po po po po");
	}
}

public class cwh_54_interfaces {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		AvonCycle cycleHarry = new AvonCycle();
		cycleHarry.applyBrake(1);
		cycleHarry.speedUp(2);
		cycleHarry.blowHorn();
		// You can create properties in Interfaces
		System.out.println(cycleHarry.a);
		System.out.println(cycleHarry.x);

		/*
		 * You cannot modify the properties in Interfaces as they are final cycleHarry.a
		 * = 454; System.out.println(cycleHarry.a);
		 */

		cycleHarry.blowHornK3g();
		cycleHarry.blowHorn2();
	}
}
