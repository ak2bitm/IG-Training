package com.akhilesh.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamMainTest02 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("ram","mohan","ramesh","sadanand","","kishor","akilesh","");
		List<String> list = Arrays.asList("Ram","mohan","ramesh","sadanand","kishor","akilesh");
		System.out.println("---------List name which start with r or R---------");
		list.stream().filter(s->s.toLowerCase().startsWith("r")).map(s->s).forEach(System.out::println);
		System.out.println("------------Convert first letter in upper case-----------");
		list.stream().map(s->s.substring(0, 1).toUpperCase()+ s.substring(1).toLowerCase())
			.forEach(System.out::println);
		System.out.println("------------count empty string------------");
		long res = list1.stream().filter(s->s.isEmpty())
			.count();
		System.out.println("Empty String :"+res);
		System.out.println("--------Removing empty string and converting to list-----------");
		list1.stream().filter(s->!s.isEmpty())
			.collect(Collectors.toList()).forEach(System.out::println);
	}
}
