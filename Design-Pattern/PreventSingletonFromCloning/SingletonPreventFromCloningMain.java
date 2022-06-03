package com.designPattern.PreventSingletonFromCloning;

public class SingletonPreventFromCloningMain {

	public static void main(String[] args) throws CloneNotSupportedException{
		Singleton instanceOne = Singleton.getInstance();
		Singleton instanceTwo = (Singleton) instanceOne.clone();
		System.out.println(instanceOne.hashCode());// Instance one Hash code
		System.out.println(instanceTwo.hashCode());// Instance two Hash code 
	}
} 
