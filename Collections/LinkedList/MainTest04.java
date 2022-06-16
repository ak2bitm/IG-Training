package com.akhilesh.LinkedList;

import java.util.*;

public class MainTest04 {

	public static void main(String[] args) { 
		   LinkedList<String> list = new LinkedList<String>(); 
		   list.add("INDIA"); 
		   list.add("USA"); 
		   list.add("JAPAN"); 
		   list.add("UK"); 
		   list.add("CANADA"); 
		   System.out.println("Original LinkedList :"); 
		   System.out.println(list); 

		// Call peek() method to retrieve the first element from list. 
		   Object firstElement = list.peekFirst(); // Return type of this method is an Object. 
		   System.out.println("Retrieve the first element: " +firstElement); 
		   Object lastElement = list.peekLast(); 
		   System.out.println("Retrieve the last element: " +lastElement); 

		   Object element1 = list.pollLast();//retrieve and remove the last element from the list. 
		   System.out.println("Retrieve and remove the last element: " +element1); 
		   System.out.println("LinkedList Element after using pollLast() method"); 
		   System.out.println(list); 
	}
}
