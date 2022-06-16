package com.akhilesh.Set;

import java.util.*;

public class MainTest04 {

	public static void main(String[] args) { 
		  List<Integer> list = new ArrayList<Integer>(); 
		  int size = list.size(); 
		 System.out.println("Size before adding elements: " +size); 
		  list.add(5); 
		  list.add(10); 
		  list.add(5); 
		  list.add(15); 
		  list.add(20); 
		  list.add(10); 
		  list.add(20); 
		  list.add(30); 
		 System.out.println("Original order of List Elements"); 
		 System.out.println(list); 
		 
		Set<Integer> s = new HashSet<Integer>(list); 
		System.out.println("Unodered List Elements after removing duplicates."); 
		System.out.println(s); 
	}
}
