package com.company;

class Phone {
	public void name() {
		System.out.println("Model no : Nokia 1100");
	}

	public void showTime() {
		System.out.println("Time is 8 am");
	}

	public void on() {
		System.out.println("Turning on Phone...");
	}
}

class SmartPhone extends Phone {
	public void music() {
		System.out.println("Playing music...");
	}

	public void on() {
		System.out.println("Turning on SmartPhone...");
	}
}

public class cwh_49_dynamic_method_dispatch {
	public static void main(String[] args) {
		Phone obj1 = new Phone(); // Allowed
		obj1.name();
		SmartPhone mobile = new SmartPhone(); // Allowed
		mobile.music();

		Phone obj = new SmartPhone(); // Yes it is allowed
		// SmartPhone obj2 = new Phone(); // Not allowed

		obj.showTime();
		obj.on();
		// obj.music(); Not Allowed

	}
}
