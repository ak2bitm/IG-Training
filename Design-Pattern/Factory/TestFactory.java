package com.designPattern.Factory;

public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "4GB", "50GB", "2.0GHz");
		Computer server = ComputerFactory.getComputer("server", "16GB", "200GB", "2.6GHz");
		System.out.println("Pc Configuration :"+pc.getRAM()+" "+pc.getHDD()+" "+pc.getCPU());
		System.out.println("Server Configuration :"+server.getRAM()+" "+server.getHDD()+" "+server.getCPU());
	}
} 
