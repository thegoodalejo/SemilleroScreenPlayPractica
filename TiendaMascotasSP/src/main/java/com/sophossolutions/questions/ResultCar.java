package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ResultCar implements Question<String> {

	private Target strObtenido;

	public ResultCar(Target stobte) {
		this.strObtenido = stobte;
	}

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(strObtenido).viewedBy(actor).asString();
	}

	public static ResultCar in(Target text) {
		return new ResultCar(text);
	}

}