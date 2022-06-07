package com.akhilesh.ExampleWithoutLambda;

public class MainTest {

	public static void main(String[] args) {
		Hai h = new Hai();
		System.out.println("------Using Old Style------");
		h.message();
		System.out.println("------Using Lambda Style------");
		//we don't need to write implementation classes
		Hello h1 = ()->{
			System.out.println("Hello India!!!!!!!!");
		};
		h1.message();
	}
}
