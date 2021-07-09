package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextObtainedFromString implements Question<String> {

	private String strText;

	public TextObtainedFromString(String strText) {
		this.strText = strText;
	}

	@Override
	public String answeredBy(Actor actor) {
		return strText;
	}

	public static TextObtainedFromString in(String strText) {
		return new TextObtainedFromString(strText);
	}

}
