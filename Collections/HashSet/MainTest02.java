package com.akhilesh.HashSet;

import java.util.*;

public class MainTest02 {

	public static void main(String[] args) { 
		   ArrayList<String> al = new ArrayList<String>(); 
		    al.add("Monday"); 
		    al.add("Tuesday"); 
		    al.add("Wednesday"); 
		    al.add("Thursday"); 
		    al.add("Friday"); 

		    al.add("Monday");//duplicate 
		    al.add("Friday"); //duplicate
		   System.out.println("Original Elements Order "); 
		   System.out.println(al); 

		// Create HashSet object. 
		   HashSet<String> hset = new HashSet<String>(); 

		// Call addAll() method for adding all elements from existing collection to HashSet. 
		   hset.addAll(al); 
		  System.out.println("Unordered HashSet Elements without Duplicate elements"); 
		  System.out.println(hset); 
	}
}
