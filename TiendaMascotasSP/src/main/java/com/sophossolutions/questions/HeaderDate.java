package com.sophossolutions.questions;

import com.sophossolutions.ui.FinalOrderPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.util.Calendar;

public class HeaderDate implements Question<String> {
	Calendar fecha = Calendar.getInstance();

	@Override
	public String answeredBy(Actor actor) {

		String[] strHeaderDate = Text.of(FinalOrderPage.TXT_ORDER_DATE).viewedBy(actor).asString().split(" ");
		int año = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH) + 1;
		int dia = fecha.get(Calendar.DAY_OF_MONTH) ;

		String strDate;

		if (mes < 10 && dia < 10) {
			strDate = año + "/0" + mes + "/0" + dia;

		} else if (mes < 10 && dia > 9) {
			strDate = año + "/0" + mes + "/" + dia;
		} else if (mes > 9 && dia < 10) {
			strDate = año + "/" + mes + "/0" + dia;
		} else {
			strDate = año + "/" + mes + "/" + dia;
		}

		System.out.println("Aquie esta la fecha actual :" + strDate );
		System.out.println("Aquie esta la fecha actual :" + strHeaderDate[2]);
		
		if (strDate == strHeaderDate[2]) {
			return "true";
		}else {
			return "false";
		}

	}

	public static HeaderDate in() {
		return new HeaderDate();
	}

}