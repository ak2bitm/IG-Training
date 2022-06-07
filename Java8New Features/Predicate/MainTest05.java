package com.akhilesh.Predicate;

import java.util.*;
import java.util.function.Predicate;

public class MainTest05 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(20);list.add(21);list.add(22);list.add(23);list.add(24);list.add(25);list.add(26);
		System.out.println(list);
		System.out.println("--------------------------------------");
		list.removeIf(num->num%2==0);//we are passing directly lambda expression
		System.out.println(list);
		System.out.println("--------------------------------------");
		List<Integer> list1 = new ArrayList<>();
		list1.add(20);list1.add(21);list1.add(22);list1.add(23);list1.add(24);list1.add(25);list1.add(26);
		list1.removeIf(num->num%2!=0);//we are passing directly lambda expression
		System.out.println(list1);
	}
}
