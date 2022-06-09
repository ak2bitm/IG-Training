package com.akhilesh.Optional;

import java.util.Optional;

public class MainTest02 {

	public static void main(String[] args) {
		// creating Optional using of() with value
		String str = "India";
		Optional<String> op1 = Optional.of(str);
		System.out.println("1."+op1);
		System.out.println("2."+op1.orElse("Hello"));
		System.out.println("3."+op1);
		System.out.println("4."+op1.isPresent());
		System.out.println("5."+op1.get());
		System.out.println("-----------------");
		if(op1.isPresent()) {
			System.out.println("6."+op1.get());
		}else {
			System.out.println("No value is found.");
		}
	}
	
}
