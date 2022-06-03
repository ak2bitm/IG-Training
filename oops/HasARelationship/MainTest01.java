package com.akhilesh.HasARelationship;

public class MainTest01 {

	public static void main(String[] args) {
		Address ad = new Address("vns", "up", "india", 221002);
		Person st = new Person();
		st.display("Ram",ad);
	}
}
