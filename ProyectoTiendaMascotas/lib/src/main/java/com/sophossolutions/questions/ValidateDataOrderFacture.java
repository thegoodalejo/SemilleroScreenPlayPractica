package com.sophossolutions.questions;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateDataOrderFacture implements Question {

	private String[] strDataOrder;

	public ValidateDataOrderFacture(String[] strDataOrder) {
		super();
		this.strDataOrder = strDataOrder;
	}

	@Override
	public Object answeredBy(Actor actor) {
		// ["","#1234", "2021/07/08", ""]
		LocalDate strDateFacture = LocalDate.parse(strDataOrder[2].toString(),
				DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		LocalDate strDateCurrent = LocalDate.now(ZoneId.of("UTC"));

		if (strDataOrder[1] != "" && strDateFacture.compareTo(strDateCurrent) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static ValidateDataOrderFacture withData(String[] strDataOrder) {
		return new ValidateDataOrderFacture(strDataOrder);
	}

}
