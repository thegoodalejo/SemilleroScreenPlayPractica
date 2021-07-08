package com.grupo3.questions;

import java.util.LinkedList;

import com.grupo3.util.JsonValidator;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheLatestApiResponse implements Question<Boolean>{

	LinkedList<JsonValidator> validators;
	
	public TheLatestApiResponse(String firstRoute, Object firstExpected) {
		validators = new LinkedList<>();
		validators.add(new JsonValidator(firstRoute, firstExpected));
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		SerenityRest.lastResponse().prettyPeek();
		for (JsonValidator validator : validators) {
			if (!validator.isValidForResponse(SerenityRest.lastResponse())) {
				return false;
			}
		}
		return true;
	}
	
	public static TheLatestApiResponse shouldHave(String route, Object expectedResult) {
		return new TheLatestApiResponse(route, expectedResult);
	}
	
	public TheLatestApiResponse and(String route, Object expectedResult) {
		this.validators.add(new JsonValidator(route, expectedResult));
		return this;
	}
	
	
}
