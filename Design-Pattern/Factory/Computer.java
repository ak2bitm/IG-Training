package com.designPattern.Factory;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	 
	@Override
	public String toString() {
		return this.getRAM() + "," + this.getHDD() + ", " + this.getCPU();
	}
	
	
}
