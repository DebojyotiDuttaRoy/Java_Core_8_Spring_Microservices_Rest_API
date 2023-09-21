package com.company;

public class cwh_09_Associativity_Operators {
	public static void main(String[] args) {
		System.out.println("Precedence & Associativity");
		int a1 = 6 * 5 - 34 / 2;
		/*
		 * Highest precedence goes to * and /. They are then evaluated on the basis of
		 * left to right associativity =30-34/2 =30-17 =13
		 */
		int b1 = 60 / 5 - 34 * 2;
		/*
		 * = 12-34*2 =12-68 =-56
		 */
		System.out.println(a1);
		System.out.println(b1);

		System.out.println("---------------------------");
		System.out.println("Quick Quiz 1");
		int x = 6;
		int y = 1;
		int k1 = x * y / 2;
		System.out.println(k1);
		System.out.println("---------------------------");
		System.out.println("Quick Quiz 2");
		int b = 8;
		int c = 4;
		int a = 2;
		float k2 = (b * b - 4f * a * c) / (2f * a);
		System.out.println(k2);
	}
}
