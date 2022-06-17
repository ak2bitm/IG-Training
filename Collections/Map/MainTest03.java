package com.akhilesh.Map;

import java.util.*;

public class MainTest03 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		 
		   map.put("A", "Apple");
		   map.put("B", "Boy");
		   map.put("C", "Cat");
		   map.put("D", "Dog");
		   map.put("E", "Elephant");
		   
		System.out.println("Orignal Entries in Map: " +map);   
		   map.replace("E", "Element");
		   System.out.println("Updated Entries in Map after replacing: " +map);
		   
		// Replace old value with a new value.
		   map.replace("B", "Boy", "Bucket");
		   System.out.println(map);
	}
}
