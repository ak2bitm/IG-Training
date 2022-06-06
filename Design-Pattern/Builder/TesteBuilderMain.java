package com.designPattern.Builder;

public class TesteBuilderMain {

	public static void main(String[] args) {
		Computer com = new Computer.ComputerBuilder("50 GB", "2GB")
				.setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println(com.getHDD()+" "+com.getRAM()+" "+com.isGraphicsCardEnabled()+" "+com.isBluetoothEnabled());
	}
}
