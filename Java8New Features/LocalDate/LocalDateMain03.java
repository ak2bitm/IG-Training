package com.akhilesh.LocalDate;

import java.time.LocalDate;

public class LocalDateMain03 {

	public static void main(String[] args) {
		//it will parse date specified in string in proper format otherwise will get exception
		
		LocalDate date = LocalDate.parse("2022-06-22");
		System.out.println("Date :"+date);
	}
}
