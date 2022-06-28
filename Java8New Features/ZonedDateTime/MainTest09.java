package com.akhilesh.ZonedDateTime;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MainTest09 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		String dateStr1 = dateTime.format(DateTimeFormatter.ISO_WEEK_DATE);
		String dateStr2 = dateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
		String dateStr3 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(dateStr1);
		System.out.println(dateStr2);
		System.out.print(dateStr3);
	}
}
