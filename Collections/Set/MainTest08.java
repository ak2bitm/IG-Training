package com.akhilesh.Set;

import java.util.*;

public class MainTest08 {

	public static void main(String[] args) { 
		   Set<Integer> s = new HashSet<Integer>();  
		   for(int i = 10; i <= 30; i++)
		   { 
		     if(i % 2 == 0) 
		     { 
		       s.add(i); 
		     } 
		   } 
		 System.out.println("Even numbers between 10 to 30"); 
		 System.out.println(s); 
		 System.out.println("Iteration Using Enchanced For Loop"); 
		 for(Integer it:s)
		 { 
		   System.out.println(it); 
		 } 
	}
}
