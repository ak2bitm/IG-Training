package com.akhilesh.LocalDateTime;

import java.time.LocalDateTime;
import java.time.Month;

public class GetterMethodMain04 {

	public static void main(String[] args) {
		LocalDateTime currDateTime = LocalDateTime.now();
		int hour = currDateTime.getHour();
		int dayOfMonth = currDateTime.getDayOfMonth();
		Month month =currDateTime.getMonth();
		System.out.println(currDateTime);
		System.out.println("Hour :"+hour);
		System.out.println("Da of Month :"+dayOfMonth);
		System.out.println("Month :"+month);
	}
}
