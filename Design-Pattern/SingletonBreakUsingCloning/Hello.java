package com.designPattern.SingletonBreakUsingCloning;

public class Hello implements Cloneable{

	int i=100;
	
	@Override
	protected Object clone()throws CloneNotSupportedException{
		return super.clone();
	} 
}
