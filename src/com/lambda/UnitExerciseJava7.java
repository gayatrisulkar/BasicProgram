package com.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseJava7 {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("charles","Diskens",43),
				new Person("Levis","Corroll",43),
				new Person("thomas","Corlyle",43),
				new Person("cholotte","Bronote",43),
				new Person("matthew","Arnlod",43)
				);
		
		//Step1-sort list by lastname
		Collections.sort(people,new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
					return o1.getLn().compareTo(o2.getLn());
				
			}
		});
		
		//Step2-Print list
		printall(people);
		
		//Step3- Print all the Lastname which has starting with c
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				
				return p.getLn().startsWith("C");
			}
			
		});
		
		//Step3- Print all the Firstname which has starting with c
				printConditionally(people, new Condition() {

					@Override
					public boolean test(Person p) {
						
						return p.getFn().startsWith("C");
					}
					
				});
				
	}

	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p:people) {
			if(p.getLn().startsWith("C")) {
			System.out.println(p);}
		}		
	}
	
	
	private static void printall(List<Person> people) {
		for(Person p:people) {
			System.out.println(p);
		}
		
	}
	
	

}
interface Condition{
	boolean test(Person p);
}