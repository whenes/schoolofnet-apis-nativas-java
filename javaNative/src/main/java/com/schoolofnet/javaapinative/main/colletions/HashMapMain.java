package com.schoolofnet.javaapinative.main.colletions;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(0, "aa");
		hashMap.put(2, "cc");
		hashMap.put(1, "bb");
		
		Integer index = null;
		System.out.println(hashMap.containsValue("cc"));
		
		System.out.println(hashMap.get(1));
		
		System.out.println(hashMap.toString());
		
		hashMap.remove(2);
		System.out.println(hashMap.values());		
		
		System.out.println(hashMap.size());
	}
}
