package com.akhilesh.Set;

import java.util.*;

public class MainTest09 {

	public static void main(String[] args) {
		 Set<Character> s = new HashSet<Character>(); 
		  s.add('A'); 
		  s.add('B'); 
		  s.add('C'); 
		  s.add('D'); 
		  s.add('E'); 
		 System.out.println(s); 
		 
		System.out.println("Iterating using forEach loop in Java 1.8"); 
		 s.forEach(System.out::println);
	}
}
