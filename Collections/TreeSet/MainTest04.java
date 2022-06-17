package com.akhilesh.TreeSet;

import java.util.*;

public class MainTest04 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		 ts.add(25);
		 ts.add(80);
		 ts.add(05);
		 ts.add(100);
		 ts.add(90);
		 ts.add(200);
		 ts.add(300);
		System.out.println("Sorted TreeSet: " +ts);

		// Using methods of NavigableSet interface.
		  System.out.println("Largest element less than 100: " +ts.lower(100));//90
		  System.out.println("Smallest element greater than 100: " +ts.higher(100));//200
		  System.out.println("Floor: " +ts.floor(85));//80
		  System.out.println("Ceiling: " +ts.ceiling(10));//25 
		  
		  System.out.println(ts.pollFirst()); // Remove and retrieve the first element from the set. 5
		  System.out.println(ts.pollLast()); // Remove and retrieve the last element from the set. 300
		  System.out.println("New Treeset: " +ts);
		  
		  System.out.println("HeadSet: " +ts.headSet(90,true));//[25,80,90]
		  System.out.println("SubSet: " +ts.subSet(90, true, 200, true));//[90,100,200]
	}
}
