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

		String[] strHeaderDate = Text.of(FinalOrderPage.TXT_ORDER_DATE).viewedBy(actor).asString().split(" ");

		
		DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
		Date dateOrder = parseFecha(strHeaderDate[2]);
		Date date = new Date();
		String dateToStr = dateformat.format(date);
		String dateToOrder = dateformat.format(dateOrder);
		
		System.out.println("Date is actual con formato " + dateToStr);
		System.out.println("Date is Orden  con formato " + dateToOrder);

		if (dateToOrder == dateToStr) {
			return "true";
		} else {
			return "false";
		}

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