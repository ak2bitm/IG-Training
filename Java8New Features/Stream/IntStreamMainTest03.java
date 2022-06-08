package com.akhilesh.stream;

import java.util.Arrays;

public class IntStreamMainTest03 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("-----Using for loop sum of int[]-----");
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		System.out.println("Sum is :"+sum);
		System.out.println("------Using reduce() method sum of int[]-----");
		sum = Arrays.stream(numbers).reduce(0, (a,b)-> a+b);
		System.out.println("Sum using Lambda :"+sum);
		System.out.println("--------Using Integer class sum method----------");
		sum = Arrays.stream(numbers).reduce(0, Integer::sum);
		System.out.println("Sum is :"+sum);
		System.out.println("--------Using reduce substraction--------");
		int subs =Arrays.stream(numbers).reduce(0, (a,b)-> a-b);
		System.out.println("Substraction is :"+subs);//-55
		System.out.println("-------Using reduce multiplication----------");
		int mul = Arrays.stream(numbers).reduce(0, (a,b)-> a*b);//0
		System.out.println("Multiplication is :"+mul);
		System.out.println("-------Using reduce get last element---------");
		int num = Arrays.stream(numbers).reduce((f,s)->s).orElse(15);
		System.out.println("Last element is :"+num);
		
		System.out.println("----------------------------");
		
	}
}
