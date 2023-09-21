package com.company;

import java.util.*;

/*ArrayList Syntax
ArrayList<Integer> l1 = new ArrayList<>(); //Creates an ArrayList object of integer type
 */
public class cwh_91_Arraylist {
	public static void main(String[] args) {
		// Adding an element :
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(3);
		l1.add(6);
		l1.add(5, 5); // inserts 5 at the 5th index in l1
		System.out.println(l1);
		// Removing an Element
		System.out.println("Array list before : " + l1);
		l1.remove(0);
		System.out.println("ArrayList after removing the value at index 0 :" + l1);
		// Checking if an ArrayList contains a specific value or not :
		System.out.println("Array list : " + l1);
		System.out.println("L1 list contains 7 : " + l1.contains(7));
		System.out.println("L1 list contains 4 : " + l1.contains(4));
		// Merging two ArrayLists
		ArrayList<Integer> l3 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();

		l2.add(21);
		l2.add(22);
		l2.add(23);
		l2.add(24);

		l3.add(31);
		l3.add(32);
		l3.add(33);
		l3.add(34);
		l3.add(35);
		l3.add(36);

		System.out.println("L2 Array list : " + l2);
		System.out.println("L3 Array list : " + l3);

		l2.addAll(l3);
		System.out.println("L2 Array list after merging: " + l2);
		// Finding the first occurrence of a specified number in the ArrayList
		System.out.println("L1 Array list : " + l1);
		System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));
		// last occurrence of an element
		System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(3));
	}
}
