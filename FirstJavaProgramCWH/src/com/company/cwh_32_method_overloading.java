package com.company;

import java.util.Scanner;

public class cwh_32_method_overloading {
	static void foo() {
		System.out.println("Wasted!! \nGame Over \nTry again!");
	}

	static void foo(int a) {
		System.out.println("You passed Level 1 with " + a + " Score");
	}

	static void foo(int a, int b) {
		System.out.println("Congratulations.\nYou passed Level 2 with " + b + " Score");
		System.out.println("Previous Achievements : Passed Level 1 with " + a + " Score");
	}

	static void foo(int a, int b, int c) {
		System.out.println("Mission Passed \nRespect +++ \nLevel 3 Score : " + c);
		System.out.println("Previous Achievements : Passed Level 2 with " + b + " Score");
		System.out.println("Previous Achievements : Passed Level 1 with " + a + " Score");
	}

	static void change(int a) {
		// a = 98;
		System.out.println("I am unable to change : " + a);
	}

	static void change2(int[] arr) {
		arr[0] = 98;
	}

	static void tellJoke() {
		System.out.println("I invented a new word!\n" + "Plagiarism!");
	}

	public static void main(String[] args) {
		tellJoke();

		// Case 1: Changing the Integer
		int x = 45;
		change(x);
		System.out.println("The value of x after running change is: " + x);

		// Case 1: Changing the Array
		int[] marks = { 52, 73, 77, 89, 98, 94 };
		change2(marks);
		System.out.println("The value of x after running change is: " + marks[0]);

		// Method Overloading
		System.out.println("Level 1 Score : ");
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		if (a != 0) {
			System.out.println("Level 2 Score : ");
			Scanner scb = new Scanner(System.in);
			int b = scb.nextInt();
			if (b != 0) {
				System.out.println("Level 3 Score : ");
				Scanner scc = new Scanner(System.in);
				int c = scc.nextInt();
				if (c != 0) {
					foo(a, b, c);
				} else {
					foo(a, b);
				}
				scc.close();
			} else {
				foo(a);
			}
			scb.close();
		} else {
			foo();
		}
		sca.close();
		// Arguments are actual!
	}
}
