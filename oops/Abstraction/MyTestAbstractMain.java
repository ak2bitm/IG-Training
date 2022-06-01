package com.oops.abstraction;

public class MyTestAbstractMain {

	public static void main(String[] args) {
		/*
		 * We have one abstract class with name MyTestAbstract and three derived class Addition,
		 * Subtraction and Multiplication
		 * If we create subclasses object then every class object reference have their own method references
		 * and by creating each class object we achieve our result.
		 * we can do the same with interface. For this I have created one interface with name MyInterfaceOne 
		 */
		Addition a1 = new Addition();
		a1.calculate(2, 2);
		Subtraction s1=new Subtraction();
		s1.calculate(8, 2);
		Multiplication m1=new Multiplication();
		m1.calculate(2, 5);
		System.out.println("-----------------");
		
	}
}
