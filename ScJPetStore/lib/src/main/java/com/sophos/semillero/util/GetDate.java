package com.sophos.semillero.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GetDate {
	private static final String DATE_FORMAT = "yyyy/MM/dd";
	public String gatActualDate() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
		Instant instant = date.toInstant();
		LocalDateTime ldt = instant
				  .atZone(ZoneId.of("UTC"))
				  .toLocalDateTime();
		String formattedDate = ldt.format(formatter);
		return formattedDate;
    }
}
