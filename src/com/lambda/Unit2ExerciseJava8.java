package com.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit2ExerciseJava8 {

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
		performConditionally(people,p->true,p->System.out.println(p));
		
		//Step3- Print all the Lastname which has starting with c
		performConditionally(people, (p)->p.getLn().startsWith("C"),p->System.out.println(p));
		
		//Step3- Print all the Firstname which has starting with c
		performConditionally(people,(p)->p.getFn().startsWith("C"),p->System.out.println(p.getFn()));
				
	}

	private static void performConditionally(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer) {
		for(Person p:people) {
			if(predicate.test(p)) {
			consumer.accept(p);
			}
		}		
	}

}
