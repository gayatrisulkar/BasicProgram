package com.setMAp;

import java.util.Map.Entry;
import java.util.*;

public class defination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<>();
		list.add("ab");
		for(String i: list) {
			System.out.println(i);
		}
		
		Set<String> set = new HashSet<>();
		set.add("ab");
		System.out.println(set);
		set.toArray();
		System.out.println(set);
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "ab");
		for(Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
