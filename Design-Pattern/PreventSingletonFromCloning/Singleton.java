package com.designPattern.PreventSingletonFromCloning;


public class Singleton extends Hello{

	private static Singleton instance = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return instance;
	} 

	@Override
	protected Object clone()throws CloneNotSupportedException{
		//throw new CloneNotSupportedException();// stop making clone by throwing exception
		return instance;// returning the same instance 
	}
}
