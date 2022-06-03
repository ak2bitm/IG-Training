package com.designPattern.PreventSingletonFromSerialization;

import java.io.Serializable;

public class Singleton implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Singleton instance = new Singleton();
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public Object readResolve() {
		return instance; 
	}
}
