package com.akhilesh.HashSet;

import java.util.*;

public class MainTest04 {

	public static void main(String[] args) {
		 Set<String> set = new HashSet<String>(); 
		 System.out.println("Is set empty? : " + set.isEmpty()); //true
		 System.out.println("Number of elements in HashSet before adding: " +set.size()); //0
		  
		  set.add("Dollar"); 
		  set.add("Indian Rupee"); 
		  set.add("Euro"); 
		  set.add("Yen"); 
		 
		System.out.println("List of Elements in set"); 
		System.out.println(set); //[Yen, Dollar, Indian Rupee, Euro]
		System.out.println("Number of elements in the HashSet after adding: " + set.size());//4 

		System.out.println("---------------------------------"); 
		   if(set.contains("Dollar")){  
		     System.out.println("Yes, Element exists in set"); 
		   } 
		 else{ 
		   System.out.println("No, Element does not exist in set"); 
		  } 
		 System.out.println("---------------------------------"); 
		 if(set.contains("Dinar")){ 
		   System.out.println("Yes, Element exists in set "); 
		  } 
		 else { 
		    System.out.println("No, Element does not exist in set"); 
		   } 
	}
}
