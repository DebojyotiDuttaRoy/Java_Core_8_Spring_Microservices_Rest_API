package com.company;

@FunctionalInterface
interface DemoA {
	void meth1(int a);
}

interface DemoAno {
	void meth1();

	void meth2();
}

class HarryFunc implements DemoAno {
	@Override
	public void meth1() {
		System.out.println("This is method 1");
	}

	public void meth2() {
		System.out.println("This is method 2");
	}
}

class ADemo implements DemoAno {
	public void display() {
		System.out.println("Hello");
	}

	@Override
	public void meth1() {
		System.out.println("I am meth1");
	}

	@Override
	public void meth2() {
		System.out.println("I am meth2");
	}
}

public class cwh_109_lambda {
	public static void main(String[] args) {
		DemoAno obj = new ADemo();
		obj.meth1();
		obj.meth2();
		ADemo obj2 = new ADemo();
		obj2.display();
		// Anonymous Class
		/*
		 * --> DemoAno obj = new DemoAno() {
		 * 
		 * @Override public void meth1() { System.out.println("I am meth1"); }
		 * 
		 * @Override public void meth2() { System.out.println("I am meth2"); } };
		 * obj.meth1(); <--
		 */
		// Lambda Expressions
		DemoAno hf = new HarryFunc();
		hf.meth1();
		DemoA lam = (a) -> System.out.println("I am method 1 from this lambda " + a);
		lam.meth1(6);
	}
}
