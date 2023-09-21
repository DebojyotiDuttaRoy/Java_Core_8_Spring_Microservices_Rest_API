package com.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L8_Flat_Map_Method {
	
	public static void main(String[] args) {
		
		 List<String> lst1 = Arrays.asList("A","B");
		 List<String> lst2 = Arrays.asList("C","D","E");
		 List<String> lst3 = Arrays.asList("F");
		 
		 System.out.println( Stream.of(lst1,lst2,lst3).flatMap(List :: stream).collect(Collectors.toList()) );
		 	
		 Map<String,List<Integer>> map = new LinkedHashMap<>();
		 map.put("one", Arrays.asList(1,2,3)); map.put("two", Arrays.asList(4,5,6));
		  
		 System.out.println( map.values().stream().flatMap(List :: stream).collect(Collectors.toList()) );
//------------------------------------------------------------------------------------------------------------				
		List<Map<String,Integer>> lst = new ArrayList<Map<String,Integer>>();
		 
		 Map<String,Integer> m1 = new HashMap<String, Integer>();
		 m1.put("one", 11);
		 m1.put("two", 12);

		 Map<String,Integer> m2 = new HashMap<String, Integer>();
		 m2.put("three", 13);
		 m2.put("four", 14);
		
		 lst.add(m1);
		 lst.add(m2);
		  
		 System.out.println( lst.stream().map(Map :: values).flatMap(Collection ::
		 stream).collect(Collectors.toList()) );

	}
}
