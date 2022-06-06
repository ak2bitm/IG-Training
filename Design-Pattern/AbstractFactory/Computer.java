package com.designPattern.AbstractFactory;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return getRAM() + ", " + getHDD() + ", " + getCPU();
	}
	
	
}
