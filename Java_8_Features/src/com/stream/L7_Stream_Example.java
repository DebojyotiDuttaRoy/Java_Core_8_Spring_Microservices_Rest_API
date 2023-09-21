package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class L7_Stream_Example {

	public static void main(String[] args) {
		
		 List<Student> lst1 = new ArrayList<>(); lst1.add(new
		 Student("Raj",Subjects.SCIENCE,45)); lst1.add(new
		 Student("Rajiv",Subjects.MATH,35)); lst1.add(new
		 Student("Sneha",Subjects.SCIENCE,29));
		  
		 System.out.println( lst1.stream().collect(Collectors.toMap(Student :: getName,
		Student :: getSub)) ); 
		
		
		 List<Student> lst = new ArrayList<>(); lst.add(new
		 Student("Rajiv",Subjects.SCIENCE,45)); lst.add(new
		 Student("Rajiv",Subjects.MATH,35)); lst.add(new
		 Student("Sneha",Subjects.SCIENCE,29)); lst.add(new
		 Student("Rajiv",Subjects.ENGLISH,40)); lst.add(new
		 Student("Sneha",Subjects.ENGLISH,42)); lst.add(new
		 Student("Shashi",Subjects.LITERATURE,18));
		  
		 Map<String,List<Subjects>> map = new HashMap<>();
		 
		 lst.stream().forEach(stu -> { map.computeIfAbsent(stu.getName(), x -> new
		 ArrayList<Subjects>()) .add(stu.getSub()); });
		 
		 System.out.println(map);		 
	}
}
