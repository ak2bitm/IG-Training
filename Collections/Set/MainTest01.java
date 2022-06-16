package com.akhilesh.Set;

import java.util.*;

public class MainTest01 {

	public static void main(String[] args) { 
		   Set<String> s = new HashSet<String>(); 
		   int size = s.size(); 
		  System.out.println("Before adding elements Set Size: " +size); 
 
		   s.add("Orange"); // s.size()is 1.
		   s.add("Red"); // s.size() is 2.
		   s.add("Blue"); // s.size() is 3.
		   s.add("Yellow"); // s.size() is 4.
		   s.add("Green"); // Now s.size() is 5. 
		    
		   s.add("Red"); // we can not add duplicate
		   s.add("Blue"); //we can not add duplicate
		  System.out.println("Unordered Set Elements"); 
		  System.out.println(s); 

		// Check 'Black' element is present in the above set or not. 
		   if(s.equals("Black"))
		   { 
		     System.out.println("Black element is not present in set."); 
		   } 
		  else 
		  { 
		    s.add("Black"); 
		    System.out.println("Black is added successfully."); 
		    System.out.println("Set Elements after adding black element"); 
		    System.out.println(s); 
		   } 
		// Create another set object to add collection of elements to the above set. 
		   Set<String> s2 = new LinkedHashSet<String>(); 
		    s2.add("White"); 
		    s2.add("Brown"); 
		    s2.add("Red"); // Duplicate element. 

		// Call addAll() method to add all the elements of the given collection. 
		   s.addAll(s2); 
		  System.out.println("Set Elements after adding elements from given collection"); 
		  System.out.println(s);
	}
}
