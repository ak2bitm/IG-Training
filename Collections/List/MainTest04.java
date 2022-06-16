package com.akhilesh.List;

import java.util.*;

public class MainTest04 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); 
		   al.add("a"); 
		   al.add("ab"); 
		   al.add("abc"); 
		   al.add("abcd"); 
		   al.add("a"); 
		  System.out.println(al); 
		  System.out.println("------------------------------");
		   for(int i = 0; i <= 4 ; i++)
		   { 
		     String getElement = al.get(i);// getting element using get() method 
		     System.out.println(getElement); 
		   } 
		  String getElement = al.get(3); // Randomly getting element from position 3. 
		  System.out.println("Get element from specified index 3: " +getElement); 
	}
}
