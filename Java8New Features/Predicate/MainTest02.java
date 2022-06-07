package com.akhilesh.Predicate;


public class MainTest02 {

	public static void main(String[] args) {
		InterfaceA i1 = (a,b)->{
			int result = a/b;
			System.out.println("Result is :"+result);
			};
		//i1.test(10, 0);
			try {
				i1.test(10, 0);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
