package com.sophos.semillero.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateResponse implements Question<Boolean>{

	String intStatus; 
	
	public ValidateResponse (Integer intStatus) {
		this.intStatus = intStatus.toString();
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		String status = SerenityRest.lastResponse().getStatusCode()+"";
		System.out.println("Status: " + status);
		if (status.equals(intStatus))
			return true;
		return false;
	}
	
	public static ValidateResponse with (Integer intStatus) {
		return new ValidateResponse (intStatus);
	}

}
