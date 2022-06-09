package com.akhilesh.Function;

import java.util.function.Function;

public class MainTest01 {

	public static void main(String[] args) {
		System.out.println("-------Converting Uppercase---------");
		Function<String, String> f1 = s-> s.toUpperCase();
		String result = f1.apply("akhilesh");
		System.out.println(result);
		System.out.println("-------String to Int conversion----------");
		Function<String, Integer> f2 = input-> Integer.parseInt(input);
		int res = f2.apply("99");
		System.out.println(res);
		System.out.println("---------Integer to String conversion---------");
		Function<Integer, String> f3 = input-> String.valueOf(input);
		result = f3.apply(88);
		System.out.println(result);
		System.out.println("---------Integer operation----------");
		Function<Integer, Integer> f4 = input-> input + 1;
		res = f4.apply(15);
		System.out.println(res);
	}
}
