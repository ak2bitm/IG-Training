package com.akhilesh.Set;

import java.util.*;

public class MainTest06 {

	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		 set.add("Banana");
		 set.add("Orange");
		 set.add("Apple");
		 set.add("Mango");
		 
		 Iterator<String> itr = set.iterator();
		// Adding element during iteration. It will throw ConcurrentModificationException.
		 while(itr.hasNext()) 
		 { 
		   Object str = itr.next(); 
		   System.out.println(str); 
		   set.add("Grapes"); //throw ConcurrentModificationException
		  } 
	}
}
