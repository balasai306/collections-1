package com.collectionreview.service;

import java.util.Map;
import java.util.TreeMap;

public class Operation {
	public void charecterOccurrences(String input) {

		String str = input;
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), (map.get(str.charAt(i)) + 1));
			} else if (!map.containsKey(str.charAt(i)) && str.charAt(i) != 32) {
				map.put(str.charAt(i), 1);
			}
		}
		display(map);
	}

	public void display(TreeMap<Character, Integer> map) {
		System.out.println(" Occurences of charecters");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());

		}

	}

}
