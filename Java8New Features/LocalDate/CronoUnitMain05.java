package com.akhilesh.LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CronoUnitMain05 {

	public static void main(String[] args) {
		
		LocalDate currDate = LocalDate.now();
		LocalDate date1 = currDate.minus(5, ChronoUnit.DAYS);
		LocalDate date2 = currDate.plus(5, ChronoUnit.MONTHS);
		System.out.println("Current Date :"+currDate);
		System.out.println("Current Date minus 5 days :"+date1);
		System.out.println("Current Date plus 5 month :"+date2);
	}
}
