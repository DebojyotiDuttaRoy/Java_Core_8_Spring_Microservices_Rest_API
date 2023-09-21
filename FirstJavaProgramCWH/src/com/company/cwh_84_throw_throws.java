package com.company;

class NegativeRadiusException extends Exception {
	@Override
	public String toString() {
		return "Radius cannot be negative!";
	}

	@Override
	public String getMessage() {
		return "Radius cannot be negative!";
	}
}

public class cwh_84_throw_throws {

	public static double area(int r) throws NegativeRadiusException {
		if (r < 0) {
			throw new NegativeRadiusException();
		}
		return Math.PI * r * r;
	}

	public static int divide(int a, int b) throws ArithmeticException {
		// Made By Harry
		return a / b;
	}

	public static void main(String[] args) {
		// Shubham - uses divide function created by Harry
		try {
			int c = divide(6, 0);
			System.out.println(c);
			double ar = area(6);
			System.out.println(ar);
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
