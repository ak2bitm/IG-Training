package com.akhilesh.MethodReferences;

public class MainTest1 {

	public static void main(String[] args) {
		MyInteger1 i1 = (a,b)-> System.out.println("Sum is :"+a+b);
		i1.findSum(2, 4);
		System.out.println("-------------------");
		MyInteger2 i2 = (a,b)-> a+b;
		int sum = i2.findSum(5, 5);
		System.out.println("Sum is :"+sum);
	}
}
