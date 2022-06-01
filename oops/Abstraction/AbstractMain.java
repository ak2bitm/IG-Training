package com.oops.abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		MyAbstractClass e1 = new Addition();
		e1.calculate(2, 2);
		e1=new Substraction();
		e1.calculate(8, 2);
		e1=new Multiplication();
		e1.calculate(2, 5);
		System.out.println("-----------------");
		Addition a = new Addition();
		a.calculate(4, 4);
	}
}
