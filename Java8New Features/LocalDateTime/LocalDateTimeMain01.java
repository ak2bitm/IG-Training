package com.akhilesh.LocalDateTime;

import java.time.LocalDateTime;

public class LocalDateTimeMain01 {

	public static void main(String[] args) {
		LocalDateTime currDateTime = LocalDateTime.now();
		LocalDateTime dt1 = LocalDateTime.of(2022, 06, 23, 5, 50);
		LocalDateTime dt2 = LocalDateTime.parse("2022-06-25T05:50");
		System.out.println(currDateTime);
		System.out.println(dt1);
		System.out.println(dt2);
	}
}
