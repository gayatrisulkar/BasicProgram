package com.Array;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []strArray1= {"abc","xay","xya","abc","xya"};
		for (int i = 0; i < strArray1.length - 1; i++) {
            for (int j = i + 1; j < strArray1.length; j++) {
				if(strArray1[i].equals(strArray1[j])) {//abc will all 1 2 3 3 abc is matching it will print that
					System.out.println("Duplicate  "+strArray1[i]);
				}
			}
		}

	}

}

