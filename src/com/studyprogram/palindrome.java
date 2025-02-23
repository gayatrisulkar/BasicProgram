package com.studyprogram;
//Write a program in Java to check a String is palindrome or not.
public class palindrome {
	public static void main(String args[]) {
		String str="naman";
		if(isPalindrome(str)) {
			System.out.println("yes");
		}else {
			System.out.println("yes");
		}
	}
	public static boolean isPalindrome(String str) {
		int length=str.length();
		for (int i=0;i<length/2;i++) {
			if(str.charAt(i)!=str.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
		
	}

}
