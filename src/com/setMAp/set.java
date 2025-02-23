package com.setMAp;

import java.util.HashSet;
import java.util.Set;

public class set {

	public static void main(String[] args) {

		//String add in set
		Set<String> set = new HashSet<String>();
		set.add("hi");
		set.add("hi");
		set.add("hi");
		System.out.println(set.size());//1
		
		Set<set> set1 = new HashSet<set>();
		set1.add(new set(5));
		set1.add(new set(6));
		set1.add(new set(5));
		set1.add(new set(5));
		System.out.println(set1.size());//4
		
		Set<String> Hashset=new HashSet<String>();
		Hashset.add("First");
		Hashset.add("Second");
		Hashset.add("Third");
		Set<String> SubSet= new HashSet<String>();
		SubSet.add("Forth");
		SubSet.add("Fifth");
		SubSet.addAll(Hashset);
		System.out.println(SubSet);
		
		Set<String> SetA= new HashSet<String>();
		SetA.add("Forth");
		SetA.add("Fifth");
		SetA.add("Six");
		System.out.println(SetA);
		String[] Arr=new String[SetA.size()];
		SetA.toArray(Arr);
		for(String i:Arr){
			System.out.print(i+" ");
		}
		
	}
	int rollnumber;

	set(int n){
	rollnumber=n;
}
}
