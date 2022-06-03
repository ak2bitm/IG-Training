package com.designPattern.Singleton;

public class BillPlugSingleton {

	private BillPlugSingleton() {}
	private static class SingletonHelper{
		private static final BillPlugSingleton instance = new BillPlugSingleton();
	}
	public static BillPlugSingleton getInstance() {
		return SingletonHelper.instance;
	}
}
