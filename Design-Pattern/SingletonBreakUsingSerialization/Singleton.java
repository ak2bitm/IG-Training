package com.designPattern.SingletonBreakUsingSerialization;

import java.io.Serializable;

public class Singleton implements Serializable{

	private static Singleton instance = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return instance; 
	}
}
