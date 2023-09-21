package com.company;

import java.util.Scanner;

public class cwh_06_Exe1_CBSE_Per_Cal {
	public static void main(String[] args) {
		System.out.println("Enter the marks of Bengali: ");
		Scanner S1 = new Scanner(System.in);
		int sub1 = S1.nextInt();
		System.out.println("Enter the marks of English: ");
		Scanner S2 = new Scanner(System.in);
		int sub2 = S2.nextInt();
		System.out.println("Enter the marks of Maths: ");
		Scanner S3 = new Scanner(System.in);
		int sub3 = S3.nextInt();
		System.out.println("Enter the marks of Phys: ");
		Scanner S4 = new Scanner(System.in);
		int sub4 = S4.nextInt();
		System.out.println("Enter the marks of Bio: ");
		Scanner S5 = new Scanner(System.in);
		int sub5 = S5.nextInt();
		System.out.println("Enter the marks of History: ");
		Scanner S6 = new Scanner(System.in);
		int sub6 = S6.nextInt();
		System.out.println("Enter the marks of Geo: ");
		Scanner S7 = new Scanner(System.in);
		int sub7 = S7.nextInt();
		System.out.println("Enter the marks of Comp: ");
		Scanner S8 = new Scanner(System.in);
		int sub8 = S8.nextInt();
		int total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8;
//        float avg = total/8f;
		float full_marks = 800f;
		float percentage = (total * 100) / full_marks;
		System.out.println("Your percentage is :");
		System.out.println(percentage);
		S1.close();
		S2.close();
		S3.close();
		S4.close();
		S5.close();
		S6.close();
		S7.close();
		S8.close();
		
	}
}
