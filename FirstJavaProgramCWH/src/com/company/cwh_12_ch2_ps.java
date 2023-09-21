package com.company;

import java.util.Scanner;

public class cwh_12_ch2_ps {
	public static void main(String[] args) {
		// ------------Q1------------
		System.out.println("Question 1");
		float a1 = (7 / 4.0f) * (9 / 2.0f);
		System.out.println(a1);
		// ------------Q2------------
		System.out.println("Question 2");
		char aw = 'B';
		// Encrypting the aw
		aw = (char) (aw + 8);
		System.out.println(aw);
		// Decrypting the aw
		Scanner p = new Scanner(System.in);
		int pw = p.nextInt();
		aw = (char) (aw - pw);
		System.out.println(aw);
		// ------------Q3------------
		System.out.println("Question 3");
		System.out.println("Enter the number: ");
		Scanner sc1 = new Scanner(System.in);
		int a2 = sc1.nextInt();
		System.out.println(a2 > 8);
		// ------------Q4------------
		System.out.println("Question 4");
		System.out.println("Enter v: ");
		Scanner sc2 = new Scanner(System.in);
		float v = sc2.nextFloat();
		System.out.print("Enter u: ");
		Scanner sc3 = new Scanner(System.in);
		float u = sc3.nextFloat();
		System.out.print("Enter a: ");
		Scanner sc4 = new Scanner(System.in);
		float a = sc4.nextFloat();
		System.out.print("Enter s: ");
		Scanner sc5 = new Scanner(System.in);
		float s = sc5.nextFloat();
		System.out.println((v * v - u * u) / (2 * a * s));
		// ------------Q4------------
		System.out.println("Question 5");
		int x = 7;
		int af = 7 * 49 / x + 35 / x;
		System.out.println(af);
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
		p.close();
	}
}
