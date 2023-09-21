package com.company;

import java.util.Scanner;

public class cwh_35_practice_set_on_methods {
	static void multiplication(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.format("%d X %d = %d\n", n, i, n * i);
		}
	}

	static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern1_rec(int n) {
		if (n > 0) {
			pattern1_rec(n - 1);
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// pattern1_rec(3)
	// pattern1_rec(2) + 3 times star and new line
	// pattern1_rec(1) + 2 times star and new line + 3 times star and new line
	// pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3
	// times star and new line
	// sum(n) = 1 + 2 + 3... + n
	// sum(n) = 1 + 2 + 3... + n-1 + n
	// sum(n) = sum(n-1) + n
	// sum(3) = 3 + sum(2)
	// sum(3) = 3 + 2 + sum(1)
	// sum(3) = 3 + 2 + 1
	static int sumRec(int n) {
		// Base condition
		if (n == 1) {
			return 1;
		}
		return n + sumRec(n - 1);
	}

	static int fib(int n) {
//        if(n==1){return 0;}
//        else if(n==2){return 1; }
		if (n == 1 || n == 2) {
			return n - 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {
		// Problem 1
		System.out.println("Enter the Number for multiplication table : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		multiplication(x);

		// Problem 2
		System.out.println("Enter the Number for pattern : ");
		Scanner sc2 = new Scanner(System.in);
		int y = sc2.nextInt();
		pattern1(y);

		// Problem 8
		pattern1_rec(y);

		// Problem 3
		System.out.println("Enter the Number n : ");
		Scanner sc3 = new Scanner(System.in);
		int z = sc3.nextInt();
		int c = sumRec(z);
		System.out.println(c);

		// Problem 5
		// fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		System.out.println("Enter the Number for fibonacci series : ");
		Scanner sc5 = new Scanner(System.in);
		int b = sc5.nextInt();
		int result = fib(b);
		System.out.println(result);
		sc.close();
		sc2.close();
		sc3.close();
		sc5.close();
		
	}
}
