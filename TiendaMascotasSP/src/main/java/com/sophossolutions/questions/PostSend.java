package com.sophossolutions.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PostSend implements Question<Integer>{

	@Override
	public Integer answeredBy(Actor actor) {
		return SerenityRest.lastResponse().jsonPath().get("code");
	}
	
	public static PostSend response() {
		return new PostSend();
	}

}
