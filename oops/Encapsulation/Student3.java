package com.oops.encapsulation;

public class Student3 {

	Integer si;

	public String getSi() {
		return String.valueOf(si);
	}

	public void setSi(String si) {
		this.si = Integer.parseInt(si);
	}

	@Override
	public String toString() {
		return "Student3 [si=" + si + "]";
	}
	
}
