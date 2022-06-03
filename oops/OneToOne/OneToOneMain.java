package com.akhilesh.OneToOne;

public class OneToOneMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Ram");
		Passport p1 = new Passport();
		p1.setPassportNo(101);
		System.out.println(p.getName()+" has passport no :"+p1.getPassportNo());
	}
}
