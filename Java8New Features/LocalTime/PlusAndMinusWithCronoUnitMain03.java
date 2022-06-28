package com.akhilesh.LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class PlusAndMinusWithCronoUnitMain03 {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = t1.plus(2, ChronoUnit.HOURS);
		LocalTime t3 = t1.plus(2, ChronoUnit.MINUTES);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
