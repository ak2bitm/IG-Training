package com.akhilesh.LocalDate;

import java.time.LocalDate;

public class LengthOfMonthAndYearMain09 {

	public static void main(String[] args) {
		
		LocalDate currDate = LocalDate.now();
		System.out.println("Current Date :"+currDate);
		System.out.println("Length of Month :"+currDate.lengthOfMonth());
		System.out.println("Length of Year :"+currDate.lengthOfYear());
	}
}
