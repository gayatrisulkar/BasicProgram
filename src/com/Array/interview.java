package com.Array;

import java.util.HashMap;
import java.util.Map;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "Gayatri";
		input.toLowerCase();
		Map<Character,Integer> map= new HashMap<>();
		for(char c: input.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
			}
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
