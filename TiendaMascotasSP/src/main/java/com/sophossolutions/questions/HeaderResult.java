package com.sophossolutions.questions;


import com.sophossolutions.ui.FinalOrderPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HeaderResult implements Question<String> {
	


	@Override
	public String answeredBy(Actor actor) {

		String[] strHeader = Text.of(FinalOrderPage.TXT_ORDER_DATE).viewedBy(actor).asString().split(" ");
		int indId =Integer.parseInt(strHeader[1].replace("#", ""));
		if ( indId > 0) {
			return "true";
		}else{
			return "false";
		}
	}

	public static HeaderResult in() {
		return new HeaderResult();
	}

}
