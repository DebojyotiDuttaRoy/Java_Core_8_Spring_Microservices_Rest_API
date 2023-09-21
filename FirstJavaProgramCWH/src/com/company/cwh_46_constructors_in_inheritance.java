package com.company;

class Base1 {
	int Bid = 0;

	Base1() {
		System.out.println("I am a constructor");
	}

	Base1(int x) {
		System.out.println("I am an overloaded constructor with value of x as: " + x);
	}
}

class Derived1 extends Base1 {
	int Did = 2;

	Derived1() {
		// super(0);
		System.out.println("I am a derived class constructor");
	}

	Derived1(int x, int y) {
		super(x);
		System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
	}
}

class ChildOfDerived extends Derived1 {
	int cid = 3;

	ChildOfDerived() {
		System.out.println("I am a child of derived constructor");
	}

	ChildOfDerived(int x, int y, int z) {
		super(x, y);
		System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
	}
}

public class cwh_46_constructors_in_inheritance {
	public static void main(String[] args) {
		Base1 b = new Base1();
		System.out.println(b.Bid);

		Derived1 d = new Derived1();
		System.out.println(d.Bid);

		Derived1 d2 = new Derived1(14, 9);
		System.out.println(d2.Did);

		ChildOfDerived cd = new ChildOfDerived();
		System.out.println(cd.Bid);

		ChildOfDerived cd2 = new ChildOfDerived(12, 13, 15);
		System.out.println(cd2.cid);
	}
}
