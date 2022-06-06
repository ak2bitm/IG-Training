package com.designPattern.AbstractFactory;

public class TestAbstractFactoryMain {

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PcFactory("2GB", "50GB", "2.0GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("8GB", "100GB", "2.5GHz"));
		System.out.println("Pc Configuration :"+pc);
		System.out.println("Server Configuration :"+server);
	}
	public static void main(String[] args) {
		testAbstractFactory();
	}
	
}
