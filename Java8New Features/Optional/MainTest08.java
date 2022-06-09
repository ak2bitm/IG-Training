package com.akhilesh.Optional;

import java.util.Optional;

public class MainTest08 {

	public static void main(String[] args) {
		// map() method
		String str = "hello";
		Optional<String> op1 = Optional.ofNullable(str);
		System.out.println(op1);
		System.out.println("-------------------");
		Optional<String> op2 = op1.map(input->input);
		System.out.println(op2);
		System.out.println("--------------------");
		Optional<String> op3 = op1.map(input->input.toUpperCase());
		System.out.println(op3);
		System.out.println("----------------------");
		Optional<String> op4 = op3.map(input->new StringBuilder(input).reverse().toString());
		System.out.println(op4);
		System.out.println("--------------------");
		String str1 = null;
		Optional<String> op5 = Optional.ofNullable(str1);
		System.out.println(op5);
		System.out.println("-----------------------");
		Optional<String> op6 = op5.map(input->input.toUpperCase());
		System.out.println(op6);
	}
	
}
