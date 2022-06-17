package com.akhilesh.HashSet;

import java.util.*;

public class MainTest01 {

	public static void main(String[] args) { 
		   HashSet<String> set = new HashSet<String>();
		   set.add("First"); 
		   set.add("Second"); 
		   set.add("Third"); 
		   set.add("Fourth"); 
		   set.add("Fifth"); 
 
		   set.add("First");//duplicate ignore 
		   set.add("Third"); //duplicate ignore

		   set.add(null);// added 
		   set.add(null); // Ignored. 
		 System.out.println("Unordered and No Duplicate HashSet Elements"); 
		 System.out.println(set); 
	}
}
