package com.akhilesh.BiFunction;

import java.util.function.BiFunction;

public class MainTest01 {

	public static void main(String[] args) {
		BiFunction<String, String, String> bif1 = (input1,input2)->input1 + input2;
		String res = bif1.apply("Hello", "India");
		System.out.println(res);
		System.out.println("----------------");
		BiFunction<String, String, String> bif2 = (input1, input2)-> input1.concat(input2);
		res = bif2.apply("hai", "saturday");
		System.out.println(res);
		System.out.println("----------------------");
		BiFunction<Integer, Integer, Integer> bif3 = (input1, input2)-> input1 + input2;
		int result = bif3.apply(10, 5);
		System.out.println(result);
		System.out.println("-------------------");
		BiFunction<Integer, Integer, String> bif4 = 
					(input1,input2)->String.valueOf(input1)+String.valueOf(input2);
		res = bif4.apply(5, 5);
		System.out.println(res);
		System.out.println("-----------------------");
		BiFunction<Integer, Integer, String> bif5 = 
				(input1,input2)->String.valueOf(input1*input2);
		res = bif5.apply(5, 5);
		System.out.println(res);
	}
}
