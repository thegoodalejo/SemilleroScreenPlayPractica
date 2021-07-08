package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ResultPrice implements Question<String> {

	private Target strObtenido;

	public ResultPrice(Target stobte) {
		this.strObtenido = stobte;
	}

	@Override
	public String answeredBy(Actor actor) {

		String strtemp[] = Text.of(strObtenido).viewedBy(actor).asString().split(" ");
		return strtemp[1];
		
	}

	public static ResultPrice in(Target text) {
		return new ResultPrice(text);
	}

}