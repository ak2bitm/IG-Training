package com.akhilesh.LocalDate;

import java.time.LocalDate;

public class OtherUtilityMethodMain08 {

	public static void main(String[] args) {
		
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate+" is a leap year = "+currDate.isLeapYear());
	}
}
