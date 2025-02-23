package com.Array;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int[][] test=new int[][] {
			{1,1,2,3,4,1},
			{4,2,2,3,4,1},
			{5,1,2,3,4,1},
		};
		
		for(int[] input:test) {
			System.out.println("Array with duplicate"+Arrays.toString(input));
			System.out.println("Array without duplicate"+Arrays.toString(ab1(input)));

		}
		
	}

	public static int[] removeDuplicate(int[] input) {
		Arrays.sort(input);
		int[] result=new int[input.length];
		int previous=input[0];
		for(int i=0;i<input.length;i++) {
			int ch=input[i];
			if(previous!=ch) {
				result[i]=ch;
			}
			previous=ch;
		}
		
		return result;
	}
	  public static int[] removeDuplicate1(int[] input) {
	        Arrays.sort(input); // Sort the array to bring duplicates together
	        int[] temp = new int[input.length];
	        int index = 0; // Tracks the position in the result array

	        temp[index++] = input[0]; // Add the first element

	        for (int i = 1; i < input.length; i++) {
	            // Add the element only if it is different from the previous one
	            if (input[i] != input[i - 1]) {
	                temp[index++] = input[i];
	            }
	        }

	        // Copy the unique elements to a new array of the correct size
	        return Arrays.copyOf(temp, index);
	    }
	  
	  
	  public static int[] ab1(int[] input) {
		  Arrays.sort(input);
		  int[] result=new int[input.length];
		  int index=0;
		  result[index++]=input[0];
		  for(int i=1;i<input.length;i++) {
			  if(input[i]!=input[i-1]) {
				  result[index++]=input[i];
			  }
		  }
		  
		return result;
		  
	  }

}
