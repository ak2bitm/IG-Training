package com.oops.StaticPolymorphism;

public class StaticPolymorphismMain {

	public static void main(String[] args) {
		StaticPolymorphism sp = new StaticPolymorphism();
		sp.sum();
		sp.sum(2, 5);
		sp.sum(2, 3, 4);
		//sp.sum(2, 11.5);
		StaticPolymorphism.sum(5, 10.2);
		StaticPolymorphism.sum(5, 20.0, 10);
	}
}
