package com.company;

import java.util.Scanner;

public class cwh_18_Switch_Case_elseif {
	public static void main(String[] args) {
//-----------------Switch Case----------------------
		System.out.println("Enter Your Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		switch (age) {
		case 18:
                                            System.out.println("You are going to become an Adult!");
                                            break;
		case 23:
                                            System.out.println("You should join a Job!");
                                            break;
		case 60:
                                            System.out.println("You are going to get retired!");
                                            break;
                                        default:
                                            System.out.println("Wait for your life's nest mile stone to come!");
		}
		System.out.println("Enjoy Your life!");

//--------------Else if ladder----------------------
		if (age > 36) {
			System.out.println("You are experienced!");
		} else if (age > 30) {
			System.out.println("You are semi-experienced!");
		} else if (age > 24) {
			System.out.println("You are not experienced");
		} else {
			System.out.print("You are a fresher");
		}
		if (age < 21) {
			System.out.println(" or Student!");
		}
		sc.close();
	}
}
/*
 * Switch(var) { Case C1: //Code; break; Case C2: //Code; break; Case C3: //Code
 * break; default: //Code
 */
