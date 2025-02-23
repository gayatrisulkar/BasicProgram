package com.string;

public class Duplicatechar {
	public static void main(String args[]) {
		String str="Programming";
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);//p
			int ind=str.indexOf(ch,i+1);//indexOf method will check that ch char occure after i+1 index of perticular string
			if(ind==-1) {
				sb.append(ch);
				ch++;
			}
			
		}
		System.out.println(sb);
	}
	
}
