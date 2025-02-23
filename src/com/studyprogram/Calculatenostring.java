package com.studyprogram;
//sum of a
public class Calculatenostring {
	public static void main(String args[]) {
		String str="gfgga12324eiou13";
		
		System.out.println(sumInt(str));
	}

	private static int sumInt(String str) {
		
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))){
				sum+=Character.getNumericValue(str.charAt(i));
			}
		}
		return sum;
		
	}

	

}
