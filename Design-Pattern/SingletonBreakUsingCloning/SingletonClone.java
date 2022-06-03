package com.designPattern.SingletonBreakUsingCloning;


public class SingletonClone extends Hello{

	private static SingletonClone instance = new SingletonClone();
	private SingletonClone() {}
	public static SingletonClone getInstance() {
		return instance;
	}
	
}
