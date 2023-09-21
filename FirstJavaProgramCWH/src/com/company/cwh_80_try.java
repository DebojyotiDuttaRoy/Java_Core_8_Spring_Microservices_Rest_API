package com.company;

import java.util.Scanner;

public class cwh_80_try {
	public static void main(String[] args) throws Exception {
		int a = 6000;
		System.out.println("Enter the value of b : ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		// Without Try:
//        int c = a / b;
//        System.out.println("The result is " + c);
		// With Try:
		try {
			int c = a / b;
			System.out.println("The result is " + c);
		} catch (Exception e) {
			System.out.println("We failed to divide. Reason: ");
			System.out.println(e);
		}
		System.out.println("End of the program");
		sc.close();
	}
}
