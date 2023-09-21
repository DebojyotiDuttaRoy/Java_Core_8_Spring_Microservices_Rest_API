package com.company;

import java.util.Scanner;

interface MyCamera {
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

interface MyWifi {
	String[] getNetworks();

	void connectToNetwork(String network);
}

class MyCellPhone {
	void callNumber(int phoneNumber) {
		System.out.println("Calling " + phoneNumber);
	}

	void pickCall() {
		System.out.println("Connecting... ");
	}
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
	public void takeSnap() {
		System.out.println("Taking snap");
	}

	public void recordVideo() {
		System.out.println("Taking snap");
	}

	public void record4KVideo() {
		System.out.println("Taking snap and recoding in 4k");
	}

	public String[] getNetworks() {
		System.out.println("Getting List of Networks");
		return new String[] { "Harry", "Prashant", "Anjali5G" };
	}

	public void connectToNetwork(String network) {
		System.out.println("Connecting to " + network);
	}
}

public class cwh_57_default_methods {
	public static void main(String[] args) {
		System.out.print("Enter Phone no : ");
		Scanner sc = new Scanner(System.in);
		int Phn_no = sc.nextInt();
		MyCellPhone mc = new MyCellPhone();
		mc.callNumber(Phn_no);
		mc.pickCall();
		MySmartPhone ms = new MySmartPhone();
		ms.record4KVideo();
		// ms.greet(); --> Throws an error!
		ms.record4KVideo();
		String[] ar = ms.getNetworks();
		for (String item : ar) {
			System.out.println(item);
		}
	sc.close();
	}
}
