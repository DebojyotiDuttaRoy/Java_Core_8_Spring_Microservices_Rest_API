package com.company;

@FunctionalInterface
interface myFunctionalInterface {
	void thisMethod(int a);
//    void thisMethod2();
}

class NewPhone extends Phone {
	@Override
	public void showTime() {
		System.out.println("Time is 8PM");
	}

	@Deprecated
	public int sum(int a, int b) {
		return a + b;
	}
}

public class cwh_108_java_annotations {
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		NewPhone phone = new NewPhone();
		phone.showTime();
		int s = phone.sum(5, 6);
		System.out.println(s);
		// Lambda Expressions
		myFunctionalInterface lam = (a) -> System.out.println("I am method 1 from this lambda " + a);
		lam.thisMethod(6);
	}
}
