package com.akhilesh.Predicate;

import java.util.*;
import java.util.function.Predicate;

public class MainTest07 {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = num->num%2==0;
		Predicate<Integer> p2 = num->num%2!=0;
		Predicate<Integer> p3 = num-> num>25 && num<50;
		//check whether number is even and between 25 to 50
		boolean result = p1.and(p3).test(28);
		System.out.println(result);
		result = p1.and(p3).test(20);
		System.out.println(result);
		//check number is odd and between 25 to 50
		System.out.println("---------------------------------");
		result = p2.and(p3).test(29);
		System.out.println(result);
		result = p2.and(p3).test(19);
		System.out.println(result);
		System.out.println("---------------------------");
		//check number is even or between 25 to 50
		result = p1.or(p3).test(28);
		System.out.println(result);
		result = p1.or(p3).test(29);
		System.out.println(result);
		result = p1.or(p3).test(18);
		System.out.println(result);
		result = p1.or(p3).test(19);
		System.out.println(result);
		System.out.println("----------------------------------");
		//check number is odd or between 25 to 50
		result = p2.or(p3).test(27);
		System.out.println(result);
		result = p2.or(p3).test(28);
		System.out.println(result);
		result = p2.or(p3).test(19);
		System.out.println(result);
		result = p2.or(p3).test(20);
		System.out.println(result);
	}
}
