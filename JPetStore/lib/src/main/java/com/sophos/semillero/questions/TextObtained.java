package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextObtained implements Question<String> {

	private Target strObtenido;

	public TextObtained(Target strObtenido) {
		this.strObtenido = strObtenido;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(strObtenido).viewedBy(actor).asString();
	}

	public static TextObtained in(Target text) {
		return new TextObtained(text);
	}

}
