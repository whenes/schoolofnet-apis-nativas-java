package com.schoolofnet.javaapinative.main.colletions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(0, "a");
		list.add(1, "b");
		list.add(2, "c");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println(list.toString());
		
		Integer index = null;
		System.out.println(list.contains("c"));
		if (list.contains("c")) {
			index = list.indexOf("c");			
		}

		System.out.println(index != null);
		if (index != null) {
			list.remove(index.intValue());			
		}
		System.out.println(list.toString());
		
		System.out.println(list.size());
	}
}
