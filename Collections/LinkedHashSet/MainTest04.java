package com.akhilesh.LinkedHashSet;

import java.util.*;

public class MainTest04 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		  lhset.add("A");
		  lhset.add("B");
		  lhset.add("C");
		  lhset.add("D");
		  lhset.add("E");
		  
		// Iterating elements of LinkedHashSet using iterator() method.
		 System.out.println("Iteration using iterator"); 
		  Iterator<String> itr = lhset.iterator();  
		  while(itr.hasNext())  
		  {  
		  System.out.println(itr.next());  
		  } 
		 System.out.println(); 
		// Iterating elements of LinkedHashSet using enhanced for loop 
		 System.out.println("Iteration using enhanced for loop");
		  for(String s : lhset) 
		    System.out.print(s + " "); 
		    System.out.println(); 
	}
}
