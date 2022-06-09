package com.akhilesh.Optional;

import java.util.Optional;

public class MainTest06 {

	public static void main(String[] args) {
		// isPresent() vs ifPresent()
		String str = "hello";
		Optional<String> op1 = Optional.ofNullable(str);
		if(op1.isPresent()) {
			System.out.println(op1.get());
		}
		op1.ifPresent(input->System.out.println(input));
		System.out.println("--------------------------");
		if(op1.isPresent()) {
			System.out.println(op1.get().toUpperCase());
		}
		op1.ifPresent(input->System.out.println(input.toUpperCase()));
		System.out.println("--------------------------");
		
	}
	
}
