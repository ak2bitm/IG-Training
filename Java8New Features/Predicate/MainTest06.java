package com.akhilesh.Predicate;

import java.util.*;
import java.util.function.Predicate;

public class MainTest06 {

	public static void main(String[] args) {
		
		Predicate<String> p1 = Predicate.isEqual("Hello Guys");
		boolean result = p1.test("Hello Guys");
		System.out.println(result);
		result = p1.test("Hai Guys");
		System.out.println(result);
		System.out.println("--------------------------");
		Predicate<Integer> p2 = Predicate.isEqual(99);
		result = p2.test(99);
		System.out.println(result);
		result = p2.test(88);
		System.out.println(result);
		System.out.println("--------------------------");
		Predicate<Integer> p3 = num->num%2==0;
		Predicate<Integer> p4 = num->num%2!=0;
		result = p3.test(28);
		System.out.println(result);
		result = p3.negate().test(28);
		System.out.println(result);
		System.out.println("-----------------------");
		result = p4.test(27);
		System.out.println(result);
		result = p4.negate().test(27);
		System.out.println(result);
	}
}
