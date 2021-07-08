package com.sophossolutions.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResultPost implements Question<Integer>{

	@Override
	public Integer answeredBy(Actor actor) {
		return SerenityRest.lastResponse().getStatusCode();
	}
	
	public static ResultPost response() {
		return new ResultPost();
	}

}