package com.Array;


import java.util.ArrayList;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="abcabaababa";
		a.concat(a);
	//	System.out.println(longestpalinindrome(a));
		
	}

	private static String longestpalindrome(String a) {
		// TODO Auto-generated method stub
		char[] substring=a.toCharArray();
		ArrayList<String> substringList=new ArrayList<>(); 
		for(int i=0;i<substring.length;i++) {
			for(int j=1;j<substring.length;j++) {
			   String b=a.substring(i,j);
			   substringList.add(b);
			}
		}
		ArrayList<String> substringList1=new ArrayList<>();
		for(String value:substringList) {
			String valuereverse=new StringBuilder(value).reverse().toString();
			if(value==valuereverse) {
				substringList1.add(value);
			}
		}
		for(String value:substringList1) {
			
		}
		return null;
	}

}
