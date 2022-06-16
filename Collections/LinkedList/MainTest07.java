package com.akhilesh.LinkedList;

import java.util.*;

public class MainTest07 {

	public static void main(String[] args) { 
		   LinkedList<Character> list = new LinkedList<Character>(); 
		    list.add('A'); 
		    list.add('B'); 
		    list.add('C'); 
		    list.add('D'); 
		    list.add('E'); 

		// Iterating using Iterator. 
		   System.out.println("**Using Iterator**"); 
		   Iterator<Character> itr = list.iterator(); 
		  while(itr.hasNext())
		  { 
		   Object obj = itr.next(); 
		   System.out.println(obj); 
		   } 
	}
}
