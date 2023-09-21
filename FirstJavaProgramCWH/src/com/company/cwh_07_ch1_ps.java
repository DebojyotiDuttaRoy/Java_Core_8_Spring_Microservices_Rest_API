package com.company;

import java.util.Scanner;

public class cwh_07_ch1_ps {
	public static void main(String[] args) {
		System.out.println("Question 1");
		int a = 4;
		int b = 17;
		int c = 6;
		int sum = a + b + c;
		System.out.println(sum);

		System.out.println("Question 2");
		float subject1 = 45;
		float subject2 = 95;
		float subject3 = 48;
		float cgpa = (subject1 + subject2 + subject3) / 30;
		System.out.println(cgpa);

		System.out.println("Question 3");
		System.out.println("What is your name");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.next();
		System.out.println("Hello " + name + " have a good day!");

		System.out.println("Question 4");
		System.out.println("Kilometer");
		Scanner sc2 = new Scanner(System.in);
		float km = sc2.nextFloat();
		float mile = 0.621371f * km;
		System.out.println(mile);

		System.out.println("Question 5");
		System.out.println("Enter your number");
		Scanner sc3 = new Scanner(System.in);
		System.out.println(sc3.hasNextInt());
		sc1.close();
		sc2.close();
		sc3.close();
	}

}
