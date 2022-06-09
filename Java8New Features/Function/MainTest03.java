package com.akhilesh.Function;

import java.util.function.Function;

public class MainTest03 {

	public static void main(String[] args) {
		System.out.println("--------Converting Sting to Integer--------------");
		Function<String, Integer> f1 = input-> Integer.parseInt(input);
		int res = f1.apply("99");
		System.out.println(res);
		System.out.println("--------Adding 10 to number--------");
		Function<Integer, Integer> f2 = input-> input + 10;
		res = f2.apply(10);
		System.out.println(res);
		System.out.println("------------Applying andThen first----------");
		res = f1.andThen(f2).apply("10");
		System.out.println(res);
		System.out.println("------------Compose method applying first---------------");
		res = f2.compose(f1).apply("11");
		System.out.println(res);
		
	}
}
