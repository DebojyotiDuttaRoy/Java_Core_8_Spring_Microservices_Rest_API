package com.company;

public class cwh_26_arrays {
	public static void main(String[] args) {
		/*
		 * Classroom of 500 students - You have to store marks of these 500 students You
		 * have 2 options: 1. Create 500 variables 2. Use Arrays (recommended) There are
		 * three main ways to create an array in Java
		 */
		// 1. Declaration and memory allocation
		int[] sub_marks = new int[3];
		sub_marks[0] = 90;
		sub_marks[1] = 99;
		sub_marks[2] = 85;
		// sub_marks[3] = 64;; - throws an error
		System.out.println(sub_marks[1]);

		// 2. Declaration and then memory allocation
		int[] marks;
		marks = new int[5];
		// Initialization
		marks[0] = 100;
		marks[1] = 60;
		marks[2] = 70;
		marks[3] = 90;
		marks[4] = 86;
		System.out.println(marks[4]);

		// 3. Declaration, memory allocation and initialization together
		int[] st_marks = { 98, 45, 79, 99, 80 };
		System.out.println(st_marks[4]);
	}
}
//Array length
/*
 * marks.length //Gives 5 if marks is a reference to an array with 5 elements
 */
//Displaying an Array
/*
 * for (int i=0; i<marks.length; i++) { System.out.println(marks[i]); //Array
 * Traversal }
 */