package com.akhilesh.Map;

import java.util.*;

public class MainTest10 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		 
		   map.put("A", " Delhi");
		   map.put("B", " Mumbai");
		   map.put("C", " Banglore");
		   map.put("D", " Lucknow");
		   map.put("E", " Pune");
		   
		// Iteration over map using forEach() method.   
		   map.forEach((k,v) -> System.out.println("Key: "+ k + ", Value: " + v)); 
	}
}
