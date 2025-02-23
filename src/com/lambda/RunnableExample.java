package com.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		Thread MyThread= new Thread(new Runnable() {
			
			@Override
			public void run(){
				System.out.print("Hello");
			}
		});
		MyThread.run();
		
		Thread MyThread1= new Thread(()->System.out.print("Hello"));
		MyThread1.run();
	}

}
