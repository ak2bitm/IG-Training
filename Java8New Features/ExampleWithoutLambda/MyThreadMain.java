package com.akhilesh.ExampleWithoutLambda;

public class MyThreadMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		MyThread th = new MyThread();
		Thread th1 = new Thread(th);
		th1.start();
		Thread t = Thread.currentThread();
		for(int i=0;i<=10; i++) {
			System.out.println(t.getName()+" value is :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main End");
	}
}
