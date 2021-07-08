package com.grupo3.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date {

	private static final String DATE_FORMAT = "yyyy/MM/dd";
	
	LocalDate date;
	private Date(LocalDate d) {
		this.date = d;
	}
	
	public static Date fromString(String s) {
		LocalDate d = LocalDate.parse(s, DateTimeFormatter.ofPattern(DATE_FORMAT));
		return new Date(d);
	}
	
	public boolean isToday() {
		LocalDate today = LocalDate.now(ZoneId.of("UTC"));
		return today.compareTo(date) == 0;
	}
}
