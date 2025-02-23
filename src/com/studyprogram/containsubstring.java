package com.studyprogram;

public class containsubstring {

	    public static void main(String[] args) {
	        String str = "0102010";
	        generateSubstrings(str);
	    }

	    public static void generateSubstrings(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i; j < str.length(); j++) {
	                String substring = str.substring(i, j + 1);
	                if(substring.contains("1")&& substring.contains("2")&& substring.contains("0"))
	                System.out.println(substring);
	            }
	        }
	    }
	}

