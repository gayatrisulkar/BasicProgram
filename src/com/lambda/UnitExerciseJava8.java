package com.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class UnitExerciseJava8 {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("charles","Diskens",43),
				new Person("Levis","Corroll",43),
				new Person("thomas","Corlyle",43),
				new Person("cholotte","Bronote",43),
				new Person("matthew","Arnlod",43)
				);
		
		//Step1-sort list by lastname
		Collections.sort(people,(p1,p2)->p1.getLn().compareTo(p2.getLn()));
		
		//Step2-Print list
		printConditionally(people,p->true);
		
		//Step3- Print all the Lastname which has starting with c
		printConditionally(people, (p)->p.getLn().startsWith("C"));
		
		//Step3- Print all the Firstname which has starting with c
				printConditionally(people,(p)->p.getFn().startsWith("C"));
				
	}

	private static void printConditionally(List<Person> people,Predicate<Person> predicate) {
		for(Person p:people) {
			if(predicate.test(p)) {
			System.out.println(p);}
		}		
	}
	
	
	
	
	

}
