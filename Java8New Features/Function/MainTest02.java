package com.akhilesh.Function;

import java.util.function.Function;

public class MainTest02 {

	public static void main(String[] args) {
		System.out.println("-------------Multiply By 2---------------");
		Function<Integer, Integer> f1 = num-> num * 2;
		int res = f1.apply(10);
		System.out.println(res);
		System.out.println("-------------Multiply By 3-----------");
		Function<Integer, Integer> f2 = num-> num * 3;
		res = f2.apply(5);
		System.out.println(res);
		System.out.println("--------------andThen method---------");
		res = f1.andThen(f2).apply(6);// first andThen will be perform
		System.out.println(res);
		System.out.println("-------------compose method---------------");
		res = f1.compose(f2).apply(7);// first composed will be perform
		System.out.println(res);
	}
}
