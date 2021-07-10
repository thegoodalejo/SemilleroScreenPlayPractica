package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextObtained implements Question<String> {

	private Target tarTextOrigin;

	public TextObtained(Target tarTextOrigin) {
		this.tarTextOrigin = tarTextOrigin;
	}

	@Override
	public String answeredBy(Actor actor) {
		return tarTextOrigin.resolveFor(actor).getText();
	}

	public static TextObtained from(Target tarTextOrigin) {
		return new TextObtained(tarTextOrigin);
	}

}
