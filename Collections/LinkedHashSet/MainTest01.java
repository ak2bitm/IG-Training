package com.akhilesh.LinkedHashSet;

import java.util.*;

public class MainTest01 {

	public static void main(String[] args) {	
		 LinkedHashSet<String> lhset= new LinkedHashSet<String>();
		  int size = lhset.size();
		  System.out.println("Size of LinkedHashSet before adding elements: " +size);

		   lhset.add("Red"); // lhset.size() is 1.
		   lhset.add("Green"); // lhset.size() is 2.
		   lhset.add("Yellow"); // lhset.size() is 3.
		   lhset.add("Blue"); // lhset.size() is 4.
		   lhset.add("Orange"); // lhset.size() is 5.
		   
		System.out.println("Elements in Set: " +lhset);   
		int size2 = lhset.size();
		System.out.println("Size of LinkedHashSet after adding elements: " +size2);

		// Adding duplicate elements that already exist in set.
		  lhset.add("Red"); // duplicate not allowed
		  lhset.add("Yellow"); // duplicate not allowed
		   
		// Create another LinkedHashSet of String type.
		   LinkedHashSet<String> lhset2 = new LinkedHashSet<String>();
		   lhset2.add("Brown");// new element
		   lhset2.add(null);// null allowed only once
		   lhset2.add(null);
		   
		// Adding elements of set2 into set.
		   lhset.addAll(lhset2);
		   System.out.println("Elements in Set after adding: " +lhset);
	}
}
