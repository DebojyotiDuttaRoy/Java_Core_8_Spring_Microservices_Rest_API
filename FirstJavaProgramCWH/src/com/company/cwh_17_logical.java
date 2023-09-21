package com.company;

import java.util.Scanner;

public class cwh_17_logical {
	public static void main(String[] args) {
		// -----------For Logical AND-------------
		System.out.println("a = \"true\" or \"false\"");
		Scanner sc1 = new Scanner(System.in);
		boolean a = sc1.nextBoolean(); // boolean a = true;
		System.out.println("b = \"true\" or \"false\"");
		Scanner sc2 = new Scanner(System.in);
		boolean b = sc2.nextBoolean(); // boolean b = false;
		System.out.println("For Logical AND...");
		if (a && b) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		// -----------For Logical OR-------------
		System.out.println("For Logical OR...");

		if (a || b) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		// -----------For Logical NOT-------------
		System.out.println("For Logical NOT...");
		System.out.print("Not(a) is ");
		System.out.println(!a);
		System.out.print("Not(b) is ");
		System.out.println(!b);
		sc1.close();
		sc2.close();
	}
}
