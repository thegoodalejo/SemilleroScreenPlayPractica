package com.sophossolutions.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResponseCode implements Question{

	@Override
	public Object answeredBy(Actor actor) {
		return SerenityRest.lastResponse().statusCode();
	}
	
	public static Question<Integer> was() {
		return new ResponseCode();
	}
}
