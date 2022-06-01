package com.oops.AbstractionWithException;

import java.io.IOException;

public class MainTest02 implements MyInterfaceTwo{

	
	@Override
	public void display(){
		System.out.println("Overridden display() method in MainTest02 class");		
	}
	public static void main(String[] args) {
		MainTest02 t = new MainTest02();
		t.display();
	}

	
}
