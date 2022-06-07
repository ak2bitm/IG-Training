package com.akhilesh.LambdaExpression;

public class MyIntegerMain2 {

	public static void main(String[] args) {
		/**
		 * Lambda expression with two argument with multiple line of code.
		 */
		MyInteger2 i1 = (a,b)->{
			int sum = a + b;
			return sum;
		};
		int res = i1.numSum(2, 2);
		System.out.println("Sum is :"+res);
		System.out.println("----------------");
		/**
		 * Lambda expression with return statement
		 */
		MyInteger2 i2 = (a,b)-> {return a+b;};
		res = i2.numSum(10, 5);
		System.out.println("Sum is :"+res);
		/**
		 * Lambda expression without return statement. Even if only one line of code then 
		 * no need to provide return and curly braces.
		 */
		System.out.println("--------------");
		MyInteger2 i3 = (a,b)-> a+b;
		res = i3.numSum(5, 1);
		System.out.println("Sum is :"+res);
	}
}
