package com.company;

//import javax.print.Doc;
class EkClass {
	int a;

	public int getA() {
		return a;
	}

	EkClass(int a) {
		this.a = a;
	}

	public int return1() {
		return 1;
	}
}

class DoClass extends EkClass {
	int DoClass_id = 2;

	DoClass(int c) {
		super(c);
		System.out.println("I am a constructor");
	}
}

public class cwh_47_this_super {
	public static void main(String[] args) {
		EkClass e = new EkClass(65);
		System.out.println(e.getA());
		System.out.println(e.return1());
		DoClass d = new DoClass(5);
		System.out.println(d.DoClass_id);

	}
}