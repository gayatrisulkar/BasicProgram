package com.string;

public class replaceCharWithNumber {
	
	public static void main(String args[]) {
		String str="opentext";
		char replace='t';
		int count=1;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==replace) {
				str.replaceFirst(String.valueOf(ch), String.valueOf(count));
				count++;
			}
		}
		System.out.println(str);
	}
}
