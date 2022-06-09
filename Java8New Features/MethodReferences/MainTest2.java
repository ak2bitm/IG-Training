package com.akhilesh.MethodReferences;

public class MainTest2 {

	public static void main(String[] args) {
		SumNum1 sumNum = new SumNum1();
		MyInteger1 i1 = sumNum::sum;
		i1.findSum(10, 15);
		System.out.println("---------------");
		MyInteger1 i2 = SumNum2::sum;
		i2.findSum(5, 25);
		
	}
}
