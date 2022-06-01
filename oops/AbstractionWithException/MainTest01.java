package com.oops.AbstractionWithException;

import java.io.IOException;

public class MainTest01 implements MyInterfaceOne{

	

	@Override
	public void display() throws IOException {
		System.out.println("Overridden display() method in MainTest01 class");		
	}
	
	public static void main(String[] args) {
		MainTest01 t = new MainTest01();
		try {
			t.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
