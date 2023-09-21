package com.company;

public class cwh_27_forEachLoop {
	public static void main(String[] args) {
		// declaring an array
		int[] array = { 1, 2, 3, 3, 4, 5 };
		// traversing the array with for-each loop
		for (int j : array) {
			System.out.println(j);
		}

		float[] exact_marks = { 98.5f, 45.5f, 79.5f, 99.5f, 80.5f };
		System.out.println(exact_marks[2]);

		String[] students = { "Harry", "Rohan", "Shubham", "Smriti" };
		System.out.println(students.length);
		System.out.println(students[2]);

		int[] marks = { 98, 45, 79, 99, 80 };
		System.out.println(marks.length);

		// Displaying the Array (Naive way)
		System.out.println("Printing using Naive way");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);

		// Displaying the Array (for loop)
		System.out.println("Printing using for loop");
		for (int i = 0; i < marks.length; i++) {
			if (i == 2) {
				System.out.println("Classified data");
				continue;
			}
			System.out.println(marks[i]);
		}

		// Quick Quiz: Displaying the Array in Reverse order (for loop)
		System.out.println("Printing using for loop in reverse order");
		for (int k = marks.length - 1; k >= 0; k--) {
			System.out.println(marks[k]);
		}

		// Quick Quiz: Displaying the Array (for-each loop)
		System.out.println("Printing using for-each loop");
		for (int element : marks) {
			System.out.println(element);
		}
	}
}
//For Each Loop Syntax-----------------------------------------
/*
 * for (int element:Arr) { System.out.println(element); //Prints all the
 * elements }
 */