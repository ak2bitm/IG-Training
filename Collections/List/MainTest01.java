package com.akhilesh.List;

import java.util.*;

public class MainTest01 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); 
 
		    al.add("A"); 
		    al.add("B"); 
		    al.add("C"); 
		    al.add("D"); 
		   System.out.println("Original list : " +al);
 
		   al.add(2, "B"); // will be insert into 3rd index
		   al.add("A"); // will be insert in the last of the list
		   System.out.println("After adding duplicate element is :"); 
 
		   Iterator<String> itr = al.iterator(); 
		   while(itr.hasNext())
		   { 
		     String str = itr.next(); 
		     System.out.println(str); 
		   } 
	}
}
