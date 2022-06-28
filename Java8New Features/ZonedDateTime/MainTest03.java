package com.akhilesh.ZonedDateTime;

import java.time.ZoneId;
import java.util.Set;

public class MainTest03 {

	public static void main(String[] args) {
		Set<String> zones = ZoneId.getAvailableZoneIds();
		for(String zone : zones)
		System.out.println(zone);
	}
}
