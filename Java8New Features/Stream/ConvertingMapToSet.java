package com.akhilesh.stream;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConvertingMapToSet {

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
		Set<Integer> keySet = new HashSet<>(map.keySet());
		keySet.forEach(System.out::println);
		System.out.println("-------------------------");
		Set<String> valueSet = new HashSet<>(map.values());
		valueSet.forEach(System.out::println);
	}
}
