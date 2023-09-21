package com.company;

public class cwh_25_ch5_ps {
	public static void main(String[] args) {
		// Practice Problem 1
		int n = 4;
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// Practice Problem 2
		int sum1 = 0;
		int a = 4;
		for (int k = 0; k < a; k++) {
			sum1 = sum1 + (2 * k);
		}
		System.out.print("Sum of even numbers is: ");
		System.out.println(sum1);
		// First 4 even numbers are - 0 2 4 6

		// Practice Problem 3
		int b = 5;
		// for(int i=0; i<10; i++) - Goes from i=0 to i=9
		for (int l = 1; l <= 10; l++) {
			System.out.printf("%d X %d = %d\n", b, l, b * l);
		}

		// Practice Problem 4
		int c = 10;
		// for(int i=0; i<10; i++) - Goes from i=0 to i=9
		for (int m = 10; m >= 1; m--) {
			System.out.printf("%d X %d = %d\n", c, m, c * m);
		}

		// Practice Problem 6
		int d = 5;
		// What is factorial n = n * n-1 * n-2 ..... 1
		// 5! = 5*4*3*2*1 = 120
		int o = 1;
		int factorial = 1;
		while (o <= d) {
			factorial *= o;
			o++;
		}
		System.out.println(factorial);

		// Practice Problem 9
		int e = 8;
		int sum2 = 0;
		// for(int i=0; i<10; i++) - Goes from i=0 to i=9
		for (int p = 1; p <= 10; p++) {
			sum2 += e * p;
		}
		System.out.println(sum2);

	}
}
