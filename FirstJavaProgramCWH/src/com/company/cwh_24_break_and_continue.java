package com.company;

public class cwh_24_break_and_continue {
	public static void main(String[] args) {
		// Break using for loop
		System.out.println("Break using for loop");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			System.out.println("Java is great");
			if (i == 2) {
				System.out.println("Ending the loop");
				break;
			}
		}

		// Break using do while loop
		System.out.println("Break using do while loop");
		int j = 0;
		do {
			System.out.println(j);
			System.out.println("Java is great");
			if (j == 2) {
				System.out.println("Ending the loop");
				break;
			}
			j++;
		} while (j < 5);
		System.out.println("Loop ends here");

		// Continue using for loop
		System.out.println("Continue using for loop");
		for (int k = 0; k < 5; k++) {
			if (k == 2) {
				System.out.println("Ending the loop");
				continue;
			}
			System.out.println(k);
			System.out.println("Java is great");
		}

		// Continue using do while loop
		System.out.println("Continue using do while loop");
		int l = 0;
		do {
			l++;
			if (l == 2) {
				System.out.println("Ending the loop");
				continue;
			}
			System.out.println(l);
			System.out.println("Java is great");

		} while (l < 5);
		System.out.println("Loop ends here");
	}
}
//Break using loops Syntax-----------------------------------------
/*
 * //using for loop for(int i=10;i>0;i--){ if(i==7){ break; //break the loop }
 * System.out.println(i); }
 */
//Continue using loops Syntax-----------------------------------------
/*
 * //using for loop for(int i=7;i>0;i--){ if(i==3){ continue;//continue skips
 * the rest statement } System.out.println(i); }
 * 
 */