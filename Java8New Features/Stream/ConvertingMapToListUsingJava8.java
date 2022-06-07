package com.akhilesh.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertingMapToListUsingJava8 {

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
		List<Integer> keySet = map.keySet().stream().collect(Collectors.toList());
		keySet.forEach(System.out::println);
		System.out.println("-------------------------");
		List<String> valueSet = map.values().stream().collect(Collectors.toList());
		valueSet.forEach(System.out::println);
		System.out.println("-------------------------");
		List<Integer> keylist = map.keySet().stream()
				.filter(k->k %2==0).collect(Collectors.toList());
		System.out.println(keylist);
	}
}
