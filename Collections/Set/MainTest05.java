package com.akhilesh.Set;

import java.util.*;

public class MainTest05 {

	public static void main(String[] args) { 
		   Set<String> s = new HashSet<String>();
		   int size = s.size(); 
		  System.out.println("Size before adding elements: " +size); 
		   s.add("Orange"); // s.size() is 1.
		   s.add("Red"); // s.size() is 2.
		   s.add("Blue"); // s.size() is 3.
		   s.add("Yellow"); // s.size() is 4.
		   s.add("Green"); // s.size() is 5.
		System.out.println("Elements in set"); 
		System.out.println(s); 

		Iterator<String> itr = s.iterator(); 
		System.out.println("Iteration using Iterator method"); 
		while(itr.hasNext())
		{ 
		  String str = itr.next(); 
		  System.out.println(str); 
		 } 
	}
}
