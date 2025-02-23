package com.lambda;

import java.util.function.Consumer;

public class lambda {
public static void main(String args[]) {
	// Basic of lambda function
//	doubleNumberFunction = public double int(int a)-> {
//		return a*2;
//	};
//	greetingFunction =()->System.out.print("Hello");
//	
//	doubleNumberFunction = (int a)-> a*2;
//	
//	addFunction = (int a, int b)->a+b;
//	
//	safeDivideFunction=(int a,int b)->{
//		if (b==0) return 0;
//		return a/b;
//				};
//				
//	stringLengthCountFunction=(String s)->s.length();
	
	// type of lambda
	
	MyLambda myLambdaFunction =()->System.out.print("Hello");
	MyAdd add=(int a, int b)->a+b;
	MyAdd add1=(a, b)->a+b;
	

	
	
	
	
}
}
interface MyAdd{
	int add(int x, int y);
}
interface MyLambda{
	void foo();
}
