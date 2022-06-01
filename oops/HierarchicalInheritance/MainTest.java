package com.oops.HierarchicalInheritance;

public class MainTest {

	public static void main(String[] args) {
		Dog g = new Dog();
		g.eat();//Animal eating
		g.bark();//Dog barking
		//g.meow();//compile time error undefined method
		System.out.println("---------------");
		Cat c = new Cat();
		c.eat();//Animal eating
		c.meow();//Cat meow
		//c.bark();// compile time error undefined method
	}
}
