package com.akhilesh.LinkedHashSet;

import java.util.*;

public class MainTest02 {

	public static void main(String[] args) {	
		 LinkedHashSet<String> set= new LinkedHashSet<String>();
		   set.add("A"); 
		   set.add("G");
		   set.add("Y");
		   set.add("B");
		   set.add("O");
		   set.add(null);
		   
		System.out.println("Elements in set: " +set);   
		   set.remove(null);
		   System.out.println("Elements in set after removing: " +set);
		   System.out.println(set.size()+ " elements in set");

		// Create another LinkedHashSet of String type.
		   LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		   set2.add("S");//new element
		   set2.add(null);// new element
		   System.out.println("Elements in set2: " +set2);
		   System.out.println(set2.size()+ " elements in set2");
		   
		  System.out.println("Is S in set2? " +set2.contains("S")); // true
		  
		  set.addAll(set2);
		  System.out.println("Elements in set after adding: " +set);//[A, G, Y, B, O, S, null]
		  
		  set.removeAll(set2);
		  System.out.println("Elements in set after removing set2: " +set);//[A, G, Y, B, O]
		  
		  set.retainAll(set2);
		  System.out.println("After removing common elements in set2 " + "from set, set is " + set);
	}
}
