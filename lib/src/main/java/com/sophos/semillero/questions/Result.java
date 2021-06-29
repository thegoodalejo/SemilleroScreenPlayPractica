package com.sophos.semillero.questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.tasks.Login;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Result implements Question<String>{

	private Target strObtenido;
	
	public Result(Target stobte) {
		this.strObtenido = stobte;
	}
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(strObtenido).viewedBy(actor).asString();
	}
	
	public static Result  in(Target text) {
		return new Result(text);
	}
	
}
