package com.company;

import java.util.Scanner;

public class cwh_08_Operators {
	public static void main(String[] args) {
		System.out.println("Arithmetic Operators");
		int a = 4;
		int b1 = 15 % a; // Modulo Operator
		// 4.8%1.1 --> Returns Decimal Remainder
		System.out.println(b1);
//-------------------------------------------------------
		System.out.println("Assignment Operators");
		int b = 9;
		b *= 3;
		System.out.println(b);
//-------------------------------------------------------
		System.out.println("Comparison Operators");
		System.out.println(64 < 6);
//-------------------------------------------------------
		System.out.println("Enter the number");
		Scanner lobj = new Scanner(System.in);
		int lo = lobj.nextInt();
		System.out.println("Logical Operators");
		System.out.println(lo > 9 && lo < 100);
		System.out.println(lo > 0 || lo > 99);
		lobj.close();
//-------------------------------------------------------
		System.out.println("Bitwise Operators");
		System.out.println(2 & 3);
		// 10
		// 11
		// ------
		// 10
	}
}
