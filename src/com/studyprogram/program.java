package com.studyprogram;

import java.util.HashMap;
import java.util.Map;

public class program {

	public static void main(String[] args) {
		String input="December is very very cold month";
		input=input.toLowerCase();
		String[] words=input.split(" ");
		Map<String,Integer> wordCount=new HashMap<>();
		
		for(String word:words) {
			wordCount.put(word,wordCount.getOrDefault(word, 0)+1);
		}
		for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}

	}

}
