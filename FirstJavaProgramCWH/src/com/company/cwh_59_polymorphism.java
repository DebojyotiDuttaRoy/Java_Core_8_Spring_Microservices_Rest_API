package com.company;

import java.util.Scanner;

interface MyCamera2 {
	void takeSnap();

	void recordVideo();

	private void greet() {
		System.out.println("Good Morning");
	}

	default void record4KVideo() {
		greet();
		System.out.println("Recording in 4k...");
	}
}

interface MyWifi2 {
	void getNetworks();

	void connectToNetwork(String network);
}

class MyCellPhone2 {
	void callNumber(int phoneNumber) {
		System.out.println("Calling " + phoneNumber);
	}

	void pickCall() {
		System.out.println("Connecting... ");
	}

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
	public void takeSnap() {
		System.out.println("Taking snap");
	}

	public void recordVideo() {
		System.out.println("Taking snap");
	}

	public void record4KVideo() {
		System.out.println("Taking snap and recoding in 4k");
	}

	public void getNetworks() {
		System.out.println("Getting List of Networks");
	}

	public void connectToNetwork(String network) {
		System.out.println("Connecting to " + network);
	}

	public void sampleMeth() {
		System.out.println("meth");
	}
}

public class cwh_59_polymorphism {
	public static void main(String[] args) {
		System.out.print("Enter Phone no : ");
		Scanner sc = new Scanner(System.in);
		int Phn_no = sc.nextInt();
		MyCellPhone2 mc = new MyCellPhone2();
		mc.callNumber(Phn_no);
		mc.pickCall();
		MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
		// cam1.getNetworks(); --> Not allowed
		// cam1.sampleMeth(); --> Not allowed

		cam1.record4KVideo();

		MySmartPhone2 s = new MySmartPhone2();
		s.sampleMeth();
		s.recordVideo();
		s.getNetworks();
		s.callNumber(7979);
		sc.close();
	}
}