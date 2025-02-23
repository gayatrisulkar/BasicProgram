package com.string;

import java.util.Arrays;

public class Duplicatechar2 {
    public static void main(String[] args) {
        String input = "programming";
        input = input.toLowerCase(); // Convert to lowercase for case insensitivity

        char[] charArray = input.toCharArray();
      Arrays.sort(charArray); // Sort the characters alphabetically

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            System.out.print(currentChar);

            // Check if the next character is the same as the current character
            while (i + 1 < charArray.length && charArray[i + 1] == currentChar) {
                i++;
                System.out.print(charArray[i]);
            }
            System.out.println();
        }
        char[] ab=new char[charArray.length];
        int index=0;
        ab[index++]=charArray[0];
        for(int i=1;i<charArray.length;i++) {
        	if(charArray[i]!=charArray[i-1]) {
        		ab[index++]=charArray[i];
        	}
        }
        System.out.println(charArray);
        
    }
}
