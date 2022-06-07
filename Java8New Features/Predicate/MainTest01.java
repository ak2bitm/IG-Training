package com.akhilesh.Predicate;


public class MainTest01 {

	public static void main(String[] args) {
		InterfaceA i1 = (a,b)->{
			try {
				int result = a/b;
				System.out.println("Result is :"+result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		i1.test(10, 2);
	}
}
