package com.sophossolutions.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateLastResponse implements Question {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return SerenityRest.lastResponse().prettyPeek().asString();
	}
		
	public static ValidateLastResponse withData() {
		return new ValidateLastResponse();
	}

}
