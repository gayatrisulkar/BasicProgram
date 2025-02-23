package com.studyprogram;

public class deletevowel {
	public static void main(String args[]) {
		String str="gfggaeiou";
		
		System.out.println(Deletevowel(str));
	}
	
	public static String Deletevowel(String str) {
		StringBuilder stringBuilder=new StringBuilder();
		for (int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				
			}else {
				stringBuilder.append(str.charAt(i));
			}
		}
		return stringBuilder.toString();
	}

}
