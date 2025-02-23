package com.string;

import java.util.HashSet;
import java.util.Set;

public class duplicateCharactersInString {

	public static void main(String[] args) {
		String input="Gayatriigh";
		input=input.toLowerCase();
		Set<Character> set=new HashSet<>();
		for(int i=0;i<input.length();i++) {
			if(!set.add(input.charAt(i))) {
				System.out.println(input.charAt(i));
			}
		}

	}

}
