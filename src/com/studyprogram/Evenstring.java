package com.studyprogram;

//Java program to print Even length words in a String
public class Evenstring {
	public static void main(String args[]) {
		String Str="This is a live program";
		printevenString(Str);
	}

	public static void printevenString(String str) {
		// TODO Auto-generated method stub
		for(String word :str.split(" ")) {
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}
	} 
}
