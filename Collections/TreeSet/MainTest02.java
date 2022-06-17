package com.akhilesh.TreeSet;

import java.util.*;

public class MainTest02 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		  ts.add("India");
		  ts.add("USA");
		  ts.add("Australia");
		  ts.add("New zealand");
		  ts.add("Switzerland");
		  System.out.println("Original TreeSet :"+ts);//[Australia, India, New zealand, Switzerland, USA]
		  boolean element = ts.contains("USA");
		  System.out.println("Is USA in TreeSet: " +element);//true

		   ts.remove("New zealand");
		   System.out.println("Sorted tree set: " +ts);//[Australia, India, Switzerland, USA]
		   ts.clear();
		   System.out.println("Elements in tree set: " +ts);
	}
}
