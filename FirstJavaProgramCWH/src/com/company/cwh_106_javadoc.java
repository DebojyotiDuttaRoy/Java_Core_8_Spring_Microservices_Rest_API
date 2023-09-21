package com.company;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java
 * industry This is <i>italic</i> word
 * <p>
 * this is a new paragraph
 * </p>
 * 
 * @author Harry (CodeWithHarry)
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html"
 *      target="_blank">Java Docs</a>
 */

public class cwh_106_javadoc {
	/**
	 * This method is used to return the division of two numbers
	 * 
	 * @throws ArithmeticException if divided by 0
	 * @return Integer
	 * @param a First parameter - Integer
	 * @param b Second parameter - Integer
	 */
	public static int division(int a, int b) {
		return a / b;
	}

	public void add(int a, int b) {
		System.out.println("The sum is: " + a + b);
	}

	public static void main(String[] args) {
		System.out.println("This is my main method");
		int c = division(60, 5);
		System.out.println("Division of two numbers are : " + c);
	}
}
// --> /**Documentation comment */