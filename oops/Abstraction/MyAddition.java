package com.oops.abstraction;

public class MyAddition implements MyInterfaceOne{

	@Override
	public void calculate(int a, int b) {
		System.out.println(a+b);		
	}

}
