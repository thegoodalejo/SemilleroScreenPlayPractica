package com.sophos.semillero.questions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PostResponseHas implements Question<String> {

	private String strAttribute;

	public PostResponseHas(String strAttribute) {
		this.strAttribute = strAttribute;
	}

	@Override
	public String answeredBy(Actor actor) {	
		return theActorInTheSpotlight().recall(strAttribute);				
	}
	
	public static PostResponseHas the(String strData) {		
		return new PostResponseHas(strData);
	}
}