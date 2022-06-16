package com.akhilesh.List;

import java.util.*;

public class MainTest03 {

	public static void main(String[] args) {
		 
		 ArrayList<String> arraylist = new ArrayList<String>(); 
		   
		 arraylist.add("aa"); 
		 arraylist.add("bb"); 
		 arraylist.add(null); //adding null 
		 arraylist.add("cc"); 
		 arraylist.add("bb"); //duplicate 
		 arraylist.add(null); //adding null
		System.out.println("Original List: " +arraylist); 
		  
		Iterator<String> itr = arraylist.iterator(); 
		 while(itr.hasNext())
		 { 
		    System.out.println(itr.next()); 
		 } 
	}
}
