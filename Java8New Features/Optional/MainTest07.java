package com.akhilesh.Optional;

import java.util.Optional;

public class MainTest07 {

	public static void main(String[] args) {
		// filter() method
		String str = null;
		Optional<String> op1 = Optional.ofNullable(str);
		Optional<String> op2 = op1.filter(input->input.contains("sri"));
		System.out.println(op2);// return empty
		System.out.println("--------------------");
		String str1 = "sri";
		Optional<String> op3 = Optional.ofNullable(str1);
		Optional<String> op4 = op3.filter(input->input.contains("sri"));
		System.out.println(op4);
		System.out.println("-------------------");
		String str2 = "hello";
		Optional<String> op5 = Optional.ofNullable(str2);
		Optional<String> op6 = op5.filter(input->input.contains("sri"));
		System.out.println(op6);// if we call get() on op6 then NoSuchElementException will get
	}
	
}
