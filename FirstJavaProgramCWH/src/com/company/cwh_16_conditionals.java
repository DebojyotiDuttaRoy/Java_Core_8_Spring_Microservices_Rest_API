package com.company;

import java.util.Scanner;

public class cwh_16_conditionals {
	public static void main(String[] args) {
		System.out.print("Enter your age: ");
		Scanner sc1 = new Scanner(System.in);
		int age = sc1.nextInt();
		// boolean cond = (age == 18);
		if (age >= 18) {
			System.out.println("Yes boy, You can drive.");
		} else {
			System.out.println("No boy, You cannot drive.\nYou are underage!");
		}
		sc1.close();
	}
}

//----Syntax of If-else statement in Java :-----------
/*
 * if (condition-to-be-checked) { statements-if-condition-true; } else {
 * statements-if-condition-false; }
 */

//----If-else ladder :-----------
/*
 * if (condition1) { //Statements; else if { // Statements; } else {
 * //Statements }
 */
