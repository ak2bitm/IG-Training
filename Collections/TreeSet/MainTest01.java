package com.akhilesh.TreeSet;

import java.util.*;

public class MainTest01 {

	public static void main(String[] args) {	
		 Set<String> ts = new TreeSet<>();
		  boolean empty = ts.isEmpty();
		  System.out.println("Is TreeSet empty: " +empty);//true
		  
		  int size = ts.size();
		  System.out.println("Size of TreeSet: " +size);//0
		  
		   ts.add("India"); // ts.size() is 1.
		   ts.add("USA"); // ts.size() is 2.
		   ts.add("Australia"); // ts.size() is 3.
		   ts.add("New zealand"); // ts.size() is 4.
		   ts.add("Switzerland"); // ts.size() is 5.
		      
		System.out.println("Sorted TreeSet: " +ts);   
		int size2 = ts.size();
		System.out.println("Size of TreeSet after adding elements: " +size2);
	}
}
