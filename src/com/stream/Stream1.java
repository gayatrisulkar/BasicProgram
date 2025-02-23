package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Stream1 {

	public static void main(String[] args) {

		
		List<Integer> values=Arrays.asList(12,20,35,46,55,68,75);
		List<String> b=new ArrayList<>();
		b.add("");
		for(String i:b) {
			System.out.println(i);
		}
		int result=0;
		for(int i: values) 
		{
			if(i%5==0) {
				result +=i;
			}
			
		}
		
		System.out.println(values.stream().max((i,j)-> i>j?1:-1).map(i->i*2).get()); 
//	System.out.println(result);
//	
//	System.out.println(values.stream()
//							 .filter(i->i%5==0)
//							 .reduce(0,(c,e)->c+e));
//	
//	Predicate<Integer> p= new Predicate<Integer>() {
//		
//		public boolean test(Integer t) {
//				return t%5==0;
//		
//		}
//	};
//	
//	System.out.println(values.stream()
//							 .filter(new Predicate<Integer>() {
//									
//									public boolean test(Integer t) {
//											return t%5==0;
//									
//									}
//								})
//							 .reduce(0,(c,e)->c+e));
//	

//	System.out.println(values.stream()
//			 .filter(i->i%5==0)
//			 .map(i->i*2)
//			 .reduce(0,(c,e)->c+e));
//	
//	System.out.println(values.stream()
//			 .filter(i->i%5==0)
//			 .map(i->i*2)
//			 .findFirst()
//			 .orElse(0));
//	
	}

}
