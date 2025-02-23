package com.Array;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array basic
		int S[]= {1,2,3};
		System.out.println(Arrays.toString(S));
		System.out.println(S);
		int K[]= {1,2,3};
		int M[]= {2,2,3};
		System.out.println(Arrays.equals(K, S));
		System.out.println(Arrays.equals(K, M));
		int L[]= {2,2,1};
		Arrays.sort(L);
		System.out.println(Arrays.toString(L));
		//Anonymous Array
		System.out.println(new int[] {1,3,4}.length);
		System.out.println(new int[] {1,3,4}[1]);
		List<Integer> values=Arrays.asList(12,20,35,46,55,68,75);
		
		List<String> b=new ArrayList<>();
		b.add("");
		for(String i:b) {
			System.out.println(i);
		}
		
		Set<Integer> ab= new HashSet<>();
		ab.add(1);
		//print
		ab.add(2);
		Integer[] array=ab.toArray(new Integer[0]);//just to note how you can convert
		System.out.println(ab);
		for(int i:ab) {
			System.out.println(i);
		}
		
		Map<Integer,String> ab1= new HashMap<>();
		ab1.put(1,"b");
		//print
		ab1.put(2,"b");
		System.out.println(ab1);
		for(Map.Entry<Integer, String> a:ab1.entrySet()) {
			System.out.println(a.getKey() + " " +a.getValue());
			ab.add(a.getKey());
		}
		String g="gfddhgasj";
		char[] ch=g.toCharArray();
		for(char c:ch) {


		}
		
		
		
		
		
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
	}

}
