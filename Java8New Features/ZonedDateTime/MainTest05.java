package com.akhilesh.ZonedDateTime;

import java.time.ZonedDateTime;


public class MainTest05 {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.parse("2021-08-13T17:35:08.044680100+09:00[Asia/Tokyo]");
		System.out.print(zdt);
	}
}
