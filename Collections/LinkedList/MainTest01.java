package com.akhilesh.LinkedList;

import java.util.*;

public class MainTest01 {

	public static void main(String[] args) {
		 
		   LinkedList list = new LinkedList(); // empty linked list.
 
		   list.add("One"); 
		   list.add(2); 
		   list.add(null); // null elements  
		   list.add("Four"); 
		   System.out.println("Original LinkedList : " +list);//[One,2,null,Four]
 
		   list.add(3, "Three");//[One,2,null,Four,Three]
 
		   System.out.println("--------------------------------------"); 
		   list.addFirst("Zero");// addFirst() method add in the first position of the list 
		   System.out.println(list);//[Zero,One,2,null,Four,Three]
 
		   System.out.println("-------------------------------------"); 
		   list.addLast("Five"); // adding element in the last position of list
		   System.out.println(list);//[Zero,One,2,null,Four,Three,Five]

		   ArrayList al = new ArrayList(); 
		    al.add("Six"); 
		    al.add(7); 
		    al.add("Eight"); 

		// Call addAll() method to add all elements to the end of the linked list. 
		   list.addAll(al); //adding array list element into linked list
		   System.out.println("------------------------------"); 
		   System.out.println(list);//[Zero,One,2,null,Four,Three,Five,Six,7,Eight]

	}
}
