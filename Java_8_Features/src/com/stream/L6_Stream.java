package com.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class L6_Stream {
	public static void main(String[] args) {
		
		IntStream.range(1,6).forEach(System.out :: println);
		System.out.println("---------------------------------");
		
		 IntStream num = IntStream.iterate(2, x -> x+1); 
		 num.limit(5).forEach(System.out :: println);
		 
		 Stream.of("Java","JavaScript","Python","GO","Dart") .filter(x->
		 x.contains("J")) .map(String ::toLowerCase) .forEach(System.out :: println);
		
		Stream.generate(Math :: random).limit(5).forEach(System.out :: println);
		
		System.out.println(
		Arrays.asList("Java","JavaScript","Python","GO","Dart","Java") .stream()
		.filter(x -> x.contains("J")) .collect(Collectors.toSet()) );	
	}
}









