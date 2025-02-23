package com.string;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArr= {14,20,89,87};
		int largest=myArr[0];
		int Seclarg=myArr[0];
		for(int i=0;i<myArr.length;i++) {
			if(myArr[i]>largest) {
				Seclarg=largest;
				largest=myArr[i];
			}else if(myArr[i]>Seclarg) {
				Seclarg=myArr[i];
				
			}
		}
		System.out.println("Second largest "+Seclarg);
	}

}
