package com.akhilesh.ZonedDateTime;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MainTest10 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		String dateStr1= dateTime.format(DateTimeFormatter.ofPattern("dd ** MM ** YYYY"));
		
		System.out.print(dateStr1);
	}
}
