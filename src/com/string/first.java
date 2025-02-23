package com.string;

public class first {
	public static void main(String ar[])  
	{  
	String s="Sachin";    
	System.out.println(s.toUpperCase());//SACHIN    
	System.out.println(s.toLowerCase());//sachin    
	System.out.println(s);//Sachin(no change in original)
	String b="  Sachin  "; 
	System.out.println(b.trim());
	System.out.println(s.startsWith("Sa"));//true    
	System.out.println(s.endsWith("n"));//true
	System.out.println(s.charAt(0));//S    
	System.out.println(s.charAt(3));//h
	System.out.println(s.length());//6
	String s1="Java is a programming language. Java is a platform. Java is an Island.";      
	String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
	System.out.println(replaceString);  
	}  
}
