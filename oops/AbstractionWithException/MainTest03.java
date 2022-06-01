package com.oops.AbstractionWithException;

import java.io.IOException;

public class MainTest03 implements MyInterfaceThree{

	
	@Override
	public void display() throws IOException {
		System.out.println("Overridden display() method in MainTest03 class");		
	}
	public static void main(String[] args) {
		MainTest03 t = new MainTest03();
		try {
			t.display();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
