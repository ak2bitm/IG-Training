package com.oops.abstraction;

public class MyTestClassMain {

	public static void main(String[] args) {
		
		/*
		 * Here we are creating object of MyTestClassWithSingleMethod class
		 * We know we write a class, it is applicable to all it's objects.
		 * Means that when we write a method in a class then it is available to all objects of a class.
		 * So here we are creating object three times and calling the calculate() and get the result.
		 */
		MyTestClassWithSingleMethod myt1 = new MyTestClassWithSingleMethod();
		myt1.calcute(10, 2);
		MyTestClassWithSingleMethod myt2 = new MyTestClassWithSingleMethod();
		myt2.calcute(2, 2);
		MyTestClassWithSingleMethod myt3 = new MyTestClassWithSingleMethod();
		myt3.calcute(3, 3);
		
		System.out.println("---------------------------------------------");
		/*
		 * In this example our requirement is changed and we want addition, subtraction and multiplication
		 * In this case I have written three classes Addition, Subtraction and Multiplication
		 * Here we are creating three object and each object have the reference of three method 
		 * i.e. addition(), subtraction() and multiplication()
		 * Here we got our result but the problem with this approach is that every object has three method references
		 * So to solve this problem I have created one abstract class with name MyTestAbstract		 
		 */
		System.out.println("------------Using obj1 calling three method--------------");
		MyTestClassWithMultipleMethod obj1 = new MyTestClassWithMultipleMethod();
		obj1.addition(2, 2);
		obj1.multiplication(3, 2);
		obj1.subtration(10, 2);
		System.out.println("------------Using obj2 calling three method--------------");
		MyTestClassWithMultipleMethod obj2 = new MyTestClassWithMultipleMethod();
		obj2.addition(15, 2);
		obj2.multiplication(4, 4);
		obj2.subtration(20, 5);
		System.out.println("-------------Using obj3 calling three method--------------");
		MyTestClassWithMultipleMethod obj3 = new MyTestClassWithMultipleMethod();
		obj3.addition(5, 5);
		obj3.multiplication(12, 3);
		obj3.subtration(8, 4);
		
		
	}
}
