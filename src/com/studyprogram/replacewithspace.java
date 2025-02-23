package com.studyprogram;
//Java program to replace the string space with a given character.
public class replacewithspace {
	public static void main(String args[]){
		String str="g jhjh g";
		char replacech='m';
		System.out.println(Replacestr(str,replacech));
				
	}
	public static String Replacestr(String str,char replacech) {
		StringBuilder stringBulder=new StringBuilder();
		for (int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==' ') {
				stringBulder.append(replacech);
			}else {
				stringBulder.append(str.charAt(i));
			}
		}
		return stringBulder.toString();
	}

}
