package com.akhilesh.ZonedDateTime;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;


public class MainTest08 {

	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		
		LocalDateTime dateTime1 = LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
		LocalDateTime dateTime2 = LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault());
		
		System.out.println(dateTime1);
		System.out.println(dateTime2);
	}
}
