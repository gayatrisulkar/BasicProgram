package com.lambda;

public class Person {
	private String fn;
	private String ln;
	private int age;
	
	public Person(String fn,String ln,int age){
		this.fn=fn;
		this.ln=ln;
		this.age=age;
		
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "Person [FirstName"+fn+" LastName "+ln+" age " +age+"]";
	}
}
