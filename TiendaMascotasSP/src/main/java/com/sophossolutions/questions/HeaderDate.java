package com.sophossolutions.questions;

import com.sophossolutions.ui.FinalOrderPage;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.util.Calendar;
import java.util.Date;

public class HeaderDate implements Question<String> {
	Calendar fecha = Calendar.getInstance();

	@Override
	public String answeredBy(Actor actor) {
		
		DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String dateToStr = dateformat.format(date);
		
		return dateToStr;

	}

	public static HeaderDate in() {
		return new HeaderDate();
	}

	public static Date parseFecha(String fecha) {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
		Date fechaDate = null;
		try {
			fechaDate = formato.parse(fecha);
		} catch (ParseException ex) {
			System.out.println(ex);
		}
		return fechaDate;
	}

}