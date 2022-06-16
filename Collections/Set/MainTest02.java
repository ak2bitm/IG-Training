package com.akhilesh.Set;

import java.util.*;

public class MainTest02 {

	public static void main(String[] args) { 
		   Set<String> s = new HashSet<String>(); 
		   boolean check = s.isEmpty();
		   System.out.println("Is Set empty: " +check);//true 
		   s.add("Orange"); 
		   s.add("Red"); 
		   s.add("Blue"); 
		   s.add("Yellow"); 
		   s.add("Green"); 
		 if(s.isEmpty())
		 { 
		  System.out.println("Set is empty."); 
		  } 
		 else 
		 { 
		   System.out.println("Set is not empty.Elements in the Set"); 
		   System.out.println("-------------------------------"); 
		   System.out.println(s); 
		  } 
		 System.out.println("-------------------------------");
		// Remove an element from set. 
		   s.remove("Blue"); 
		   System.out.println("Set elements after removing"); 
		   System.out.println(s); 

		   int size = s.size(); 
		   System.out.println("Total number of elements: " +size); 
		  
	}
}
