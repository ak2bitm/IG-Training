package com.akhilesh.ExampleWithoutLambda;

public class MyThread extends Thread{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=0; i<=10; i++) {
			System.out.println(t.getName()+" value is :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
