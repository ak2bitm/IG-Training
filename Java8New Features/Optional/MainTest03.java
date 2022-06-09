package com.akhilesh.Optional;

import java.util.Optional;

public class MainTest03 {

	public static void main(String[] args) {
		// creating Optional using of() with null value
		String str = "India";
		Optional<String> op1 = Optional.of(null);
		System.out.println("1."+op1);//NullPointerException
		
	}
	
}
