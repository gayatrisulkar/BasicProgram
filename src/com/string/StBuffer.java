 package com.string;

public class StBuffer {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(1, "Java");// now original string is changed
		System.out.println(sb1);// prints HJavaello
		// focus
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.replace(1, 3, "Java");
		System.out.println(sb3);// prints HJavalo

		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.delete(1, 3);
		System.out.println(sb4);// prints Hlo

		StringBuffer sb5 = new StringBuffer("Hello");
		sb5.reverse();
		System.out.println(sb5);// prints olleH
	}
}
