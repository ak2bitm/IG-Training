package com.akhilesh.LocalDate;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class GetterMethod06 {

	public static void main(String[] args) {
		
		LocalDate currDate = LocalDate.now();
		DayOfWeek dayOfWeek = currDate.getDayOfWeek();
		int dayOfMonth = currDate.getDayOfMonth();
		int dayOfYear = currDate.getDayOfYear();
		System.out.println("Current Date :"+currDate);
		System.out.println("Day of Week :"+dayOfWeek);
		System.out.println("Day of Month :"+dayOfMonth);
		System.out.println("Day of Year :"+dayOfYear);
	}
}
