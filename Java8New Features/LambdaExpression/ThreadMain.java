package com.akhilesh.LambdaExpression;

public class ThreadMain {

	public static void main(String[] args) {
		// Thread example without Lambda
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				Thread t = Thread.currentThread();
				for(int i=0; i<=10;i++) {
					System.out.println(t.getName()+" value is:"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		// Thread example with lambda
		Runnable r2 = ()->{
			Thread t = Thread.currentThread();
			for(int i=0; i<=10;i++) {
				System.out.println(t.getName()+" value is :"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
