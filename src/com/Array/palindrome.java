package com.Array;


import java.util.ArrayList;
import java.util.List;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="naman";
		// to find how many palindrome are there in string
		palinindrome(a);
		// to find largest palindrome in string
		longestPalinindrome(a);
		
	}
	// to find how many palindrome are there in string
	private static void palinindrome(String str) {
		int count=0;
		for(int i=0;i<=str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				//String value=str.substring(i, j);
				//String reverse=new StringBuilder(str.substring(i, j)).reverse().toString();
				if(str.substring(i, j).equals(new StringBuilder(str.substring(i, j)).reverse().toString())) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
	// to find largest palindrome in string
	private static void longestPalinindrome(String str) {
		int length=0;
		String longestPalinindrome=null;
		for(int i=0;i<=str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				//String value=str.substring(i, j);
				//String reverse=new StringBuilder(str.substring(i, j)).reverse().toString();
				if(str.substring(i, j).equals(new StringBuilder(str.substring(i, j)).reverse().toString())) {
					if(length<str.substring(i, j).length()) {
						length=str.substring(i, j).length();
						longestPalinindrome=str.substring(i, j);
					}
				}
			}
		}
		System.out.println(length);
		System.out.println(longestPalinindrome);
	}

	

}
