package com.company;

class MyMainEmployee {
	private int id;
	private String name;

	public MyMainEmployee() {
		id = 0;
		name = "Your-Name-Here";
	}

	public MyMainEmployee(String myName, int myId) {
		id = myId;
		name = myName;
	}

	public MyMainEmployee(String myName) {
		id = 1;
		name = myName;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setId(int i) {
		this.id = i;
	}

	public int getId() {
		return id;
	}
}

public class cwh_42_constructors {
	public static void main(String[] args) {
		MyMainEmployee harryOld = new MyMainEmployee("ProgrammingWithHarry", 12);
		MyMainEmployee harry = new MyMainEmployee();
		harry.setName("CodeWithHarry");
		harry.setId(34);
		System.out.println(harry.getId());
		System.out.println(harry.getName());
		System.out.println(harryOld.getName() + ", Id : " + harryOld.getId());
		MyMainEmployee harry2 = new MyMainEmployee("Evolving With Harry");
		System.out.println(harry2.getName());
	}
}
