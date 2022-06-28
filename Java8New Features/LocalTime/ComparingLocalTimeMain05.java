package com.akhilesh.LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingLocalTimeMain05 {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.of(5, 32, 44);
		LocalTime t2 = t1.plus(1, ChronoUnit.HOURS);
		boolean b = t1.isAfter(t2);
		System.out.println(b);
		System.out.println("-------------");
		b = t1.isBefore(t2);
		System.out.println(b);
	}
}
