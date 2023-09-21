package com.java8;

interface Operation{
	public int opt (int x, int y);
}
public class L4_Lamda_Arg {
	/*
	public static int addition(int x, int y) {
		return x+y;
	}	*/
	public static void result(int x, int y, Operation obj) {
		System.out.println(obj.opt(x, y));
	}
	public static void main(String[] args) {
		/*
		System.out.println(addition(5, 8));	
		Operation obj = (a,b) -> (a+b);
		System.out.println(obj.opt(90, 18));
		*/
		result(90, 18, (a,b) -> (a+b));
	}
}
