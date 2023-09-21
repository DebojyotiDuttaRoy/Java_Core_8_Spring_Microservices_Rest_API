package com.company;

public class cwh_21_loops {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

		System.out.println("Using Loops:");
		int i = 100;
		while (i <= 200) {
			System.out.println(i);
			i++;
		}
		System.out.println("Finish Running While Loop!");
	}
}
//While loop Syntax-----------------------------------------
/*
 * while (Boolean condition) { // Statements -> This keeps executing as long as
 * the condition is true. }
 */
//Example : ------------------------------------------------
/*
 * int i=10; while(i>0){ System.out.println(i); i--; }
 */
//Infinite while loop :-------------------------------------
/*
 * while(true){ System.out.println("I am an infinite while loop!"); }
 */