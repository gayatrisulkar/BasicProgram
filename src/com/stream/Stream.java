package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Stream {

	public static void main(String[] args) {

		
		List<Integer> values=Arrays.asList(1,2,3,4,2,5,6);
//		int result=0;
//		for(int i :values) {
//			result=result+i*2;
//		}
		
		
		
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e)->c+e));
//		Function<Integer,Integer> f=new Function<Integer,Integer>()
//		{
//			public Integer apply(Integer i) {
//				return i*2;
//			}
//		};
//		
//		BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
//			
//			int result=0;
//			public Integer apply(Integer t, Integer u) {
//				// TODO Auto-generated method stub
//				return t+u;
//			}
//		};
//	
//		java.util.stream.Stream<Integer> s=values.stream();
//		
//		Stream s1=(Stream) s.map(f);
//		Integer result=(Integer)s1.reduce(0,b);
//		System.out.println(result);
		
//		java.util.stream.Stream<Integer> s=values.stream();
//		Stream s1=(Stream) s.map(i ->i*2);
//		Integer result=values.stream().map(i ->i*2).reduce(0,(c,e)->c+e);
		System.out.println(values.stream().map(i ->i*2).reduce(0,(c,e)->c+e));
		System.out.println(values.stream().map(i ->i*2).reduce(5,(c,e)->c+e));
		
		 
		 System.out.println(values.stream().distinct().sorted().collect(Collectors.toList()));
		 List<String> ab = Arrays.asList("ab","bc","cc");
		 ab.stream().map(String::toUpperCase).forEach(System.out::println);
		 ab.stream().filter(p->p.startsWith("a")).forEach(System.out::println);
		 
	}

	

	

}
