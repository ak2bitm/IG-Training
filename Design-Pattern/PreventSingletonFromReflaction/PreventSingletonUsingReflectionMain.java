package com.designPattern.PreventSingletonFromReflaction;

import java.lang.reflect.Constructor;


public class PreventSingletonUsingReflectionMain {

	public static void main(String[] args) {
		Singleton instanceOne = Singleton.INSTANCE;
		Singleton instanceTwo = null;
		try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for(Constructor constructor: constructors) {
				constructor.setAccessible(true);
				instanceTwo = (Singleton)constructor.newInstance();
				//break; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Instance one : "+instanceOne.hashCode());// Instance one HashCode
		System.out.println("Instance two :"+instanceTwo.hashCode());// Instance two Hash code
	}
}
