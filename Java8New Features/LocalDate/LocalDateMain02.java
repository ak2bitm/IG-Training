package com.akhilesh.LocalDate;

import java.time.LocalDate;

public class LocalDateMain02 {

	public static void main(String[] args) {
		//it will take specified date
		int year = 2022;
		int month = 06;
		int dayOfMonth = 1;
		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		System.out.println("Date :"+date);
	}
}
