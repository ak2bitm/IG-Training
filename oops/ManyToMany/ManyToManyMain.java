package com.akhilesh.ManyToMany;

public class ManyToManyMain {

	public static void main(String[] args) {
		Address add = new  Address();
		add.setState("up");
		add.setCity("vns");
		add.setPin(221002);
		Person p = new Person();
		p.setName("Ram");
		System.out.println("Name :"+p.getName());
		System.out.println("Address :"+add.getState()+" , "+add.getCity()+" ,"+add.getPin());
	}
}
