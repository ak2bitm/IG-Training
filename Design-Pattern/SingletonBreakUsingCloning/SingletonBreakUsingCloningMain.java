package com.designPattern.SingletonBreakUsingCloning;

public class SingletonBreakUsingCloningMain {

	public static void main(String[] args) throws CloneNotSupportedException{
		SingletonClone instanceOne = SingletonClone.getInstance();
		SingletonClone instanceTwo = (SingletonClone) instanceOne.clone();
		System.out.println(instanceOne.hashCode());// Instance one Hash code
		System.out.println(instanceTwo.hashCode());// Instance two Hash code 
	} 
}
