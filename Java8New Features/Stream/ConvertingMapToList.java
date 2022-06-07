package com.akhilesh.stream;

import java.util.*;

public class ConvertingMapToList {

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
		List<Integer> keySet = new ArrayList<>(map.keySet());
		keySet.forEach(System.out::println);
		System.out.println("-------------------------");
		List<String> valueSet = new ArrayList<>(map.values());
		valueSet.forEach(System.out::println);
	}
}
