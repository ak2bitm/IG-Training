package com.akhilesh.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamMainTest02 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("ram","mohan","ramesh","sadanand","","kishor","akilesh","");
		List<String> list2 = Arrays.asList("Ram","mohan","ramesh","sadanand","kishor","akilesh");
		System.out.println("---------List name which start with r or R---------");
		list2.stream().filter(s->s.toLowerCase().startsWith("r"))
			.map(s->s).forEach(System.out::println);
		System.out.println("------------Convert first letter in upper case-----------");
		list2.stream().map(s->s.substring(0, 1).toUpperCase()+ s.substring(1).toLowerCase())
			.forEach(System.out::println);
		
		System.out.println("------------count empty string------------");
		long res = list1.stream().filter(s->s.isEmpty())
			.count();
		System.out.println("Empty String :"+res);
		System.out.println("--------Removing empty string and converting to list-----------");
		list1.stream().filter(s->!s.isEmpty())
			.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("---------Converting list of string into list of Integer-----------");
		List<String> list3 = Arrays.asList("44", "51", "66", "72", "83", "90", "10");
		List<Integer> intList=list3.stream().map(s-> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(intList);
		System.out.println("---------New List 4---------");
		List<String> list4 = Arrays.asList("ab","scc","ra","aa","abc","def");
		System.out.println("-----creating list from list whose lengt more than 2 character-----");
		list4.stream().filter(s-> s.length()>2)
				.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("----Convert String to uppercase and Join them with comma----");
		String result =list4.stream().map(String::toUpperCase)
				.collect(Collectors.joining(","));
		System.out.println(result);
		System.out.println("--------------------------");
		long cntRes =list4.stream().filter(s->s.toLowerCase().startsWith("a")).count();
		System.out.println(cntRes);
		
	}
}
