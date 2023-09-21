package com.company;

import java.util.Scanner;
import java.util.Random;

public class cwh_19_ch4_ps {
	public static void main(String[] args) {
		// Question 1:
		System.out.println("Question 1 \nEnter the number");
		Scanner sc1 = new Scanner(System.in);
		int a1 = sc1.nextInt();
		if (a1 == 11) {
			System.out.println("I am 11");
		} else {
			System.out.println("I am " + a1);
		}
		

		// Question 2
		System.out.println("Question 2");
		byte m1, m2, m3;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter your marks in Physics");
		m1 = sc2.nextByte();
		
		System.out.println("Enter your marks in Chemistry");
		m2 = sc2.nextByte();

		System.out.println("Enter your marks in Mathematics");
		m3 = sc2.nextByte();
		float avg = (m1 + m2 + m3) / 3.0f;
		System.out.println("Your Overall percentage is: " + avg);
		if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
			System.out.println("Congratulations, You have been promoted");
		} else {
			System.out.println("Sorry, You have not been promoted! Please try again.");
		}
		

		// Question 3
		System.out.println("Question 3");
		System.out.println("Enter your income in LPA");
		Scanner sc3 = new Scanner(System.in);
		float tax = 0;
		float income = sc3.nextFloat();
		if (income <= 2.5) {
			tax = tax + 0;
		} else if (income > 2.5f && income <= 5f) {
			tax = tax + 0.05f * (income - 2.5f);
		} else if (income > 5f && income <= 10.0f) {
			tax = tax + 0.05f * (5.0f - 2.5f);
			tax = tax + 0.2f * (income - 5f);
		} else if (income > 10.0f) {
			tax = tax + 0.05f * (5.0f - 2.5f);
			tax = tax + 0.2f * (10.0f - 5f);
			tax = tax + 0.3f * (income - 10.0f);
		}
		System.out.println("The total tax paid by the employee is: " + tax);

		// Question 4:
		System.out.println("Question 4");
		Scanner sc4 = new Scanner(System.in);
		int day = sc4.nextInt();

		switch (day) {
		case 1:
                                            System.out.println("Monday");
                                            break;
		case 2:
                                            System.out.println("Tuesday");
                                            break;
		case 3:
                                            System.out.println("Wednesday");
                                            break;
		case 4:
                                            System.out.println("Thursday");
                                            break;
		case 5:
                                            System.out.println("Friday");
                                            break;
		case 6:
                                            System.out.println("Saturday");
                                            break;
		case 7:
                                            System.out.println("Sunday");
                                            break;
                                         default:
                                             System.out.println("Invalid Input");
		}
		
		// Question 5
		System.out.println("Question 5 \nEnter the year: ");
		Scanner sc5 = new Scanner(System.in);
		int year = sc5.nextInt();
		if ((year % 100) == 0) {
			if ((year % 400) == 0) {
				System.out.println("This is a leap year");
			} else {
				System.out.println("This is not a leap year");
			}
		} else {
			if ((year % 4) == 0) {
				System.out.println("This is a leap year");
			} else {
				System.out.println("This is not a leap year");
			}
		}

		// Question 6
		System.out.println("Question 6");
		Scanner sc = new Scanner(System.in);
		String website = sc.next();
		if (website.endsWith(".org")) {
			System.out.println("This is an organizational website");
		} else if (website.endsWith(".com")) {
			System.out.println("This is a Commercial website");
		} else if (website.endsWith(".in")) {
			System.out.println("This is an Indian website");
		}
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
		sc.close();

		// Generating random numbers in Java
		System.out.println("Generating random numbers in Java");
		Random r = new Random();
		int a = r.nextInt();
		System.out.println(a);
	}
}
