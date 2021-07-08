package com.sophos.semillero.questions;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ResponseHas implements Question<Integer> {

	private String strAttribute;

	public ResponseHas(String strAttribute) {
		this.strAttribute = strAttribute;
	}

	@Override
	public Integer answeredBy(Actor actor) {	
		return theActorInTheSpotlight().recall(strAttribute);				
	}
	
	public static ResponseHas the(String strData) {		
		return new ResponseHas(strData);
	}
}
