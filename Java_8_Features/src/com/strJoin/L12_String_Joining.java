package com.strJoin;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L12_String_Joining {

	public static void main(String[] args) {
//		StringJoiner sj = new StringJoiner(", ");
		StringJoiner sj = new StringJoiner("_", "<", "/>");
		sj.add("I");
		sj.add("Love");
		sj.add("Programming");
		System.out.println(sj);		//<I_Love_Programming/> [Expected Output]

		Stream<String> str = Stream.of("Learning", "Basic", "Programming");
		String res = str.collect(Collectors.joining("_", "<", "/>"));
		System.out.println(res);
		
		String stJ = String.join("_", "Declare","variables","not","war");
		System.out.println(stJ);
	}
}
