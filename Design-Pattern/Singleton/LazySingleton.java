package com.designPattern.Singleton;

public class LazySingleton {

	private static LazySingleton instance;
	private LazySingleton() {}
	public static LazySingleton getInsatnce() {
		if(instance==null) {
			instance= new LazySingleton();
		}
		return instance; 
	}
}
