package com.oops.abstraction;

public class MyInterfaceOneMain {

	public static void main(String[] args) {
		System.out.println("-----------For Addition-------------");
		MyAddition a1 = new MyAddition();
		a1.calculate(2, 7);
		System.out.println("-----------For Subtraction-------------");
		MySubtraction s1 = new MySubtraction();
		s1.calculate(10, 5);
		System.out.println("-----------For Multiplication-------------");
		MyMultiplication m1 = new MyMultiplication();
		m1.calculate(5, 5);
	}
}
