package com.akhilesh.BiPredicate;

import java.util.function.BiPredicate;

public class MyTest01 {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p1 = (num1,num2)-> num1>num2;
		boolean result = p1.test(10, 5);
		System.out.println(result);
		System.out.println("------------------------------");
		BiPredicate<Integer, Integer> p2 = (num1,num2)-> num1<num2;
		result = p2.test(10, 5);
		System.out.println(result);
	}
}
