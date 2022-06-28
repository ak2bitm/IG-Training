package com.akhilesh.ZonedDateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class MainTest07 {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = t1.plusHours(10).plusMinutes(5).plusSeconds(15);
		
		long hours = ChronoUnit.HOURS.between(t2, t1);
		long mins = ChronoUnit.MINUTES.between(t2, t1);
		long secs = ChronoUnit.SECONDS.between(t2, t1);
		
		System.out.println("Initial Time: " + t1 + " Final Time " + t2);
		System.out.println("Difference in Hours: " + hours);
		System.out.println("Difference in Minutes: " + mins);
		System.out.println("Difference in Seconds: " + secs);
	}
}
