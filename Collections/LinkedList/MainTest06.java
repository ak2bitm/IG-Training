package com.akhilesh.LinkedList;

import java.util.*;

public class MainTest06 {

	public static void main(String[] args) { 
		   LinkedList<String> list = new LinkedList<String>();
		    list.add("A"); 
		    list.add("B"); 
		    list.add("C"); 
		    list.add("D"); 

		// Iterating using for loop. 
		  System.out.println("**For loop**"); 
		  for(int i = 0; i < list.size(); i++) 
		  {
		    Object element = list.get(i);
		    System.out.println(element); 
		} 
		// Iterating using Advanced for loop. 
		   System.out.println("**Advanced For loop**"); 
		   for(String str: list) 
		   { 
		     System.out.println(str); 
		   } 
		// Iterating using while loop. 
		   System.out.println("**While Loop**"); 
		   int num = 0; 
		  while (list.size() > num) 
		  { 
		    System.out.println(list.get(num)); 
		     num++; 
		   } 
	}
}
