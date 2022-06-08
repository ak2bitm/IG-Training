package com.akhilesh.stream;

import java.util.HashMap;
import java.util.stream.Collectors;

public class UsingStreamHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("dd", 11);
		hm.put("bb", 55);
		hm.put("ee", 33);
		hm.put("aa", 22);
		hm.put("cc", 44);
		System.out.println("--------Getting keys based on values--------");
		hm.entrySet().stream().filter(val-> val.getValue()>22)
		.map(key->key.getKey()).sorted().forEach(System.out::println);
		System.out.println("--------Getting keys based on condition and collecting into list --------");
		hm.entrySet().stream().filter(val->val.getValue()>22)
			.map(key->key.getKey()).collect(Collectors.toList())
			.forEach(System.out::println);
	}
}
