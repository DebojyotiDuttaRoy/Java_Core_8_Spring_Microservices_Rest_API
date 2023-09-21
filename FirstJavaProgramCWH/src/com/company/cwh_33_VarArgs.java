package com.company;

public class cwh_33_VarArgs {
	static int add(int... arr) {
		int result = 0;
		for (int a : arr) {
			result = result + a;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(2, 3, 4));
		System.out.println(add(4, 5, 6));
	}
}
//Syntax
/*
 * public static void foo(int … arr) { // arr is available here as int[] arr }
 */
