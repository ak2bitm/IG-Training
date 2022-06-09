package com.akhilesh.Optional;

import java.util.Optional;

public class MainTest09 {

	public static void main(String[] args) {
		// map() method
		String str = "hello";
		Optional<Optional<String>> op1 = Optional.of(Optional.ofNullable(str));
		System.out.println("1."+op1);
		System.out.println("2."+op1.map(input->input));
		System.out.println("3."+op1.flatMap(input->input));
		System.out.println("---------1-------");
		Optional<Optional<String>> op2 =op1.map(input1->input1.map(input2->input2.toUpperCase()));
		System.out.println(op2);
		System.out.println("--------2-------");
		Optional<String> op3 = op1.flatMap(input1->input1.map(in2->in2.toUpperCase()));
		System.out.println(op3);
		System.out.println("--------3--------");
		String str2 = "hai";
		Optional<Optional<Optional<String>>> op4 =
				Optional.of(Optional.of(Optional.ofNullable(str2)));
		Optional<Optional<Optional<String>>> op5 = op4.map(input->input);
		System.out.println(op5);
	}
	
}
