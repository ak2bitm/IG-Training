package com.akhilesh.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainTest02 {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zdt = ZonedDateTime.now(zone);
		System.out.println(zdt);
	}
}
