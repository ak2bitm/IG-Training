package com.akhilesh.LocalTime;

import java.time.LocalTime;

public class GetterMethodMain04 {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.of(5, 32, 44);
		int hour = t1.getHour();
		int minutes = t1.getMinute();
		int second = t1.getSecond();
		System.out.println("Time :"+t1);
		System.out.println("Hour :"+hour);
		System.out.println("Minutes :"+minutes);
		System.out.println("Second :"+second);
	}
}
