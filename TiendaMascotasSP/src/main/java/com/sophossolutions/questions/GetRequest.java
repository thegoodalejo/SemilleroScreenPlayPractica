package com.sophossolutions.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetRequest implements Question<Integer>{

	@Override
	public Integer answeredBy(Actor actor) {
		return Integer.valueOf(SerenityRest.lastResponse().getStatusCode());
	}
	
	public static GetRequest code() {
		return new GetRequest();
	}

}
