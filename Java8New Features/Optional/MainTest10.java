package com.akhilesh.Optional;

import java.util.Optional;

public class MainTest10 {

	public static void main(String[] args) {
		
		String str = "hello";
		Optional<Optional<Optional<String>>> op1 = Optional.of(Optional.of(Optional.ofNullable(str)));
		System.out.println(op1);
		System.out.println("-----------------------");
		Optional<Optional<Optional<String>>> op2 = 
				op1.map(in1->in1.map(in2->in2.map(in3->in3.toUpperCase())));
		System.out.println(op2);
		System.out.println("---------------------------");
		Optional<Optional<String>> op3 =
				op1.flatMap(in1->in1.map(in2->in2.map(in3->in3.toUpperCase())));
		System.out.println(op3);
		System.out.println("----------------------------");
		Optional<String> op4 = 
				op1.flatMap(in1->in1.flatMap(in2->in2.map(in3->in3.toUpperCase())));
		System.out.println(op4);
	}
	
}
