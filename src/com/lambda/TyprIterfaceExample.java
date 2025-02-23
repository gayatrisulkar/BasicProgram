package com.lambda;

public class TyprIterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringLengthLambda mylambda=s->s.length();
	System.out.print(mylambda.getLength("Hello Lambda"));	
	printLambda(s->s.length());
	}
	
	
	public static void  printLambda(StringLengthLambda l){
		System.out.print(l.getLength("Hello"));
	}
}
interface StringLengthLambda{
	int getLength(String s);
}