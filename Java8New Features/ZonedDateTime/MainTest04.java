package com.akhilesh.ZonedDateTime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class MainTest04 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		ZoneOffset offset = ZoneOffset.of("+09:00");
		OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);
		System.out.print(offsetDateTime);
	}
}
