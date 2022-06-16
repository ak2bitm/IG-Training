package com.akhilesh.List;

import java.util.*;

public class MainTest02 {

	public static void main(String[] args) {
		 
		   ArrayList<Integer> al = new ArrayList<Integer>(6); 
		    al.add(10); 
		    al.add(20); 
		    al.add(30); 
		    al.add(40); 
		    al.add(50); 
		    al.add(60); 
		  System.out.println(al); 

		 Integer sizelist = al.size(); // getting size of the list
		 System.out.println("Original size: " +sizelist); 

		// The initial capacity of array list is full. 
		 //when we add a new element to the list, its capacity is automatically increase by 50%. 
		    al.add(70); 
		    al.add(80);  
		    Integer size = al.size(); 
		    System.out.println("After adding new elements, Array List size: " +size); 

		    al.remove(6); 
		    System.out.println(al); 
	}
}
