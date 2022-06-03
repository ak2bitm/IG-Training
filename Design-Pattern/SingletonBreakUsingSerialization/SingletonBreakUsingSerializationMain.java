package com.designPattern.SingletonBreakUsingSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class SingletonBreakUsingSerializationMain {
 
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Singleton instanceOne = Singleton.getInstance();
		Singleton instanceTwo = null;
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("abc.ser"));
		out.writeObject(instanceOne);
		out.close();
		ObjectInput in = new ObjectInputStream(new FileInputStream("abc.ser"));
		instanceTwo=(Singleton)in.readObject();
		
		System.out.println(instanceOne.hashCode());// Instance one hash code
		System.out.println(instanceTwo.hashCode());// Instance two hash code
	}
}
