package com.akhilesh.LambdaExpression;

public class MyIntegerMain {

	public static void main(String[] args) {
		/**
		 * Lambda with type parameter.
		 */
		MyInteger i1 = (int a, int b)->{
			System.out.println("Sum of Two Number is :"+(a+b));
		};
		i1.sumNum(2, 5);
		System.out.println("-----------------");
		/**
		 * Lambda expression without type parameter, because compiler task is improved in java 8
		 * Now compiler can guess the type of argument. so no need to provide type also 
		 */
		MyInteger i2 = (a,b)->{
			System.out.println("Sum of Two Number is :"+(a+b));
		};
		i2.sumNum(5, 5);
		System.out.println("------------------");
		MyInteger i3 = (a,b)-> System.out.println("Sum of Two number is :"+(a+b));
		i3.sumNum(10, 5);
	}
}
