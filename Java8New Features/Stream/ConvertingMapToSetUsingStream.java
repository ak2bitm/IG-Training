package com.akhilesh.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertingMapToSetUsingStream {

	
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "bb");
		hashMap.put(2, "cc");
		hashMap.put(3, "aa");
		hashMap.put(4, "aa");
		hashMap.put(5, "dd");
		System.out.println("-----converting values into set 1st way -----");
		hashMap.values().stream().collect(Collectors.toSet())
			.forEach(System.out::println);
		System.out.println("-----converting values into LinkedHashSet 2nd way -----");
		hashMap.values().stream().collect(Collectors.toCollection(LinkedHashSet::new))
			.forEach(System.out::println);
		System.out.println("-----converting keys into list 1st way -----");
		hashMap.keySet().stream()
			.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("-----converting keys into ArrayList 2nd way ----");
		hashMap.keySet().stream()
			.collect(Collectors.toCollection(ArrayList::new))
			.forEach(System.out::println);
		System.out.println("-----Using entrySet converting into list 1st way-----");
		hashMap.entrySet().stream()
			.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("-----Using entrySet converting into list 2nd way-----");
		hashMap.entrySet().stream()
			.collect(Collectors.toCollection(ArrayList::new))
			.forEach(System.out::println);
	}
}
