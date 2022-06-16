package com.akhilesh.LinkedList;

import java.util.*;

public class MainTest02 {

	public static void main(String[] args) {
		 
		   LinkedList<String> list = new LinkedList<String>(); 
		   int size = list.size(); 
		   System.out.println("Size of Linkedlist: " +size); 
 
		   list.add("Zero"); 
		   list.add("First"); 
		   list.add("Second"); 
		   list.add(null); // null element 
		   list.add("Fourth"); 
		   list.add("25"); 
		  System.out.println("Original LinkedList order: " +list);//[Zero, First, Second, null, Fourth, 25]  
		   list.removeFirst(); // remove first element
		   System.out.println("after removing the first element"); 
		   System.out.println(list);//[First, Second, null, Fourth, 25] 
		   System.out.println("after removing the last element"); 
		   list.removeLast();//[First, Second, null, Fourth]
		   System.out.println(list); 

		   list.remove(2);
		   System.out.println("after removing the element at index position 2 "); 
		   System.out.println(list);//[First, Second, Fourth] 

		
		   ArrayList<String> al = new ArrayList<String>(); 
		    al.add("Third"); 
		    al.add("Fourth"); 
		  
		  list.addAll(2, al); 
		  System.out.println(list); //[First, Second, Third, Fourth, Fourth] 
	}
}
