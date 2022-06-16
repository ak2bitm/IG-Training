package com.akhilesh.LinkedList;

import java.util.*;

public class MainTest03 {

	public static void main(String[] args) {
		 
		   LinkedList<Integer> list = new LinkedList<Integer>();  
		   for(int i = 0 ; i <= 20; i++)
		   { 
		    if(i % 2 == 0)
		       list.add(i); 
		   } 
		// Call getFirst() method to get first even number. 
		   Object firstEvenNumber = list.getFirst(); // Return type of getFirst() methods is an Object. 
		   System.out.println("First even number: " +firstEvenNumber); 

		  Object lastEvenNumber = list.getLast(); 
		  System.out.println("Last even number: " +lastEvenNumber); 
		  Object getElement = list.get(5); 
		  System.out.println("Even number at index 5: " +getElement); 
	}
}
