package com.akhilesh.BinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class MainTest01 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bif1 = (num1,num2)-> num1+num2;
		int res = bif1.apply(10, 10);
		System.out.println(res);
		System.out.println("--------------------");
		BinaryOperator<Integer> biop1 = (num1,num2)-> num1+num2;
		res = biop1.apply(5, 15);
		System.out.println(res);
		System.out.println("---------------------");
		BiFunction<String, String, String> bif2 = (input1,input2)-> input1 + input2;
		String result = bif2.apply("Hello", "India");
		System.out.println(result);
		System.out.println("----------------------");
		BinaryOperator<String> biop2 = (input1,input2)-> input1+input2;
		result = biop2.apply("hai", "guys");
		System.out.println(result);
	}
}
