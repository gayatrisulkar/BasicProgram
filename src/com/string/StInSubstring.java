package com.string;
//Suppose we are given a string s1, we need to the find total 
//number of substring(including multiple occurrences of the same substring) of s1 which are present in string s2. 
//input=s1 = aab
//      s2 = aaaab output=1

public class StInSubstring {
	public static void main(String args[]) {
	String str="abcdab";
	String sub="ab";
	int c=0;
	for(int i=0;i<=str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			String t=str.substring(i,j);
			if(t.equals(sub)) {
				c=c+1;
			}
		}
	}
	if(c==0) {
		System.out.println("not found");
	}else {
		System.out.println(c);
	}
	
}
}
