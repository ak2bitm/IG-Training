package com.akhilesh.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertingMapToSetUsingJava8 {

	static Map<Integer, String> getMap(){
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "bb");
		hashMap.put(2, "cc");
		hashMap.put(3, "aa");
		hashMap.put(4, "dd");
		return hashMap;
	}
	public static void main(String[] args) {
		Map<Integer, String> map = getMap();
		Set<Integer> keySet = map.keySet().stream().collect(Collectors.toSet());
		keySet.forEach(System.out::println);
		System.out.println("-------------------------");
		Set<String> valueSet = map.values().stream().collect(Collectors.toSet());
		valueSet.forEach(System.out::println);
	}
}
