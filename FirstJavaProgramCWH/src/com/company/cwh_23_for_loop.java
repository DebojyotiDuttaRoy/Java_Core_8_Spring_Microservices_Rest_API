package com.company;

import java.util.Scanner;

public class cwh_23_for_loop {
	public static void main(String[] args) {
		// Incrementing For loop
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		// Write a program to print first n odd numbers using a for loop
		// 2i = Even Numbers = 0, 2, 4, 6, 8
		// 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
		System.out.println("Write a program to print first n odd numbers using a for loop");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(2 * i + 1);
		}
		// Decrementing For loop
		for (int j = 5; j != 0; j--) {
			System.out.println(j);
		}
		// Write a program to print first n natural numbers in reverse order
		System.out.println("Write a program to print first n natural numbers in reverse order");
		Scanner sc2 = new Scanner(System.in);
		int m = sc2.nextInt();
		for (int k = m; k > 0; k--) {
			System.out.println(k);
		}
		sc1.close();
		sc2.close();
	}
}
//For loop Syntax-----------------------------------------
/*
 * for (initialize; check_bool_expression; update){ //code; }
 */
//Example : ---------------------------------------------------
/*
 * for (i=7; i!=0; i--){ System.out.println(i); }
 */