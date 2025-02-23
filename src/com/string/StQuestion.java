package com.string;

public class StQuestion {
	public static void main(String args[]) {
		//Reverse the word of a String
		//My Name is Navin
		//Navin is Name My
		
		String Str="My Name is Navin";
		String a[]=Str.split(" ");
		char[] a1= Str.toCharArray();
		for(int i=a1.length-1;i>=0;i--) {
			System.out.print(a1[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

		
	}
}
