package com.company;

import java.util.Scanner;

//import java.util.*;
public class cwh_65_packages {
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("This is my scanner taking input as " + a);
		sc.close();
	}
}