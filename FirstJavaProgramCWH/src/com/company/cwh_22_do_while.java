package com.company;

import java.util.Scanner;

public class cwh_22_do_while {
	public static void main(String[] args) {
		// While loop
		System.out.println("Enter the value of a : ");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		while (a < 5) {
			System.out.println(a);
			a++;
		}
		// Do While loop
		System.out.println("Enter the value of b : ");
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		do {
			System.out.println(b);
			b++;
		} while (b < 5);
		// 2nd Do While loop
		System.out.println("2nd Do While loop");
		int c = 1;
		do {
			System.out.println(c);
			c++;
		} while (c <= 45);
		sc1.close();
		sc2.close();
	}
}
//Do While loop Syntax-----------------------------------------
/*
 * do { //code } while (condition); //Note this semicolon
 */
//Example : ---------------------------------------------------
/*
 * int i=1; do{ System.out.println(i); i++; }while(i<=10);
 */