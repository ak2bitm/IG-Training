package com.akhilesh.Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class MainTest11 {

	public static void main(String[] args) {
		
		String str = "hello";
		Optional<String> op1 = Optional.ofNullable(str);
		System.out.println(op1);
		System.out.println(op1.orElse("India"));
		System.out.println(op1.orElseGet(()->"ok ok"));
		System.out.println(op1.orElseThrow(NoSuchElementException::new));
		System.out.println("---------------------------------");
		String str2 = null;
		Optional<String> op2 = Optional.ofNullable(str2);
		System.out.println(op2);
		System.out.println(op2.orElse("Hai"));
		System.out.println(op2.orElseGet(()-> "ok ok ok"));
		System.out.println(op2.orElseThrow(NoSuchElementException::new));
	}
	
}
