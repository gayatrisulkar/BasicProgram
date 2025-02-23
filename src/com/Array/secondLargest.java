package com.Array;

import java.util.Arrays;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr= {1,2,36,57};
	int largest=arr[0];
    int seclargest=0;
    //first solution
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>largest) {
			seclargest=largest;
			largest=arr[i];
			
		}
		
	}
	System.out.println("seclargest: "+seclargest);
	//second solution but one catch is there if the repetated no occure then also it will not work
	Arrays.sort(arr);
	int sec=arr[arr.length-2];
	System.out.println("seclargest: "+sec);
	}
	
	

}
