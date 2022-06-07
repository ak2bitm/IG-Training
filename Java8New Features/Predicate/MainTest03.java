package com.akhilesh.Predicate;

import java.util.function.Predicate;

public class MainTest03 {

	public static void main(String[] args) {
		// Testing here that inputed number is even or odd
		Predicate<Integer> p1 = (num)-> num%2 ==0;
		System.out.println("---------For Even----------");
		boolean result = p1.test(10);
		System.out.println(result);
		System.out.println("---------For Odd-----------");
		result = p1.test(9);
		System.out.println(result);
		System.out.println("---------For Odd--------");
		Predicate<Integer> p2 = (num)-> num%2 !=0;
		result = p2.test(10);
		System.out.println(result);
		System.out.println("---------For Even--------");
		result = p2.test(9);
		System.out.println(result);
	}
}
