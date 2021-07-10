package com.sophos.semillero.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateIDMsj implements Question<Boolean> {

	String intStatus; 
	String strMsj;
	
	public ValidateIDMsj (Integer intStatus, String strMsj) {
		this.intStatus = intStatus.toString();
		this.strMsj = strMsj;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		String status = SerenityRest.lastResponse().getStatusCode()+"";
		String postMsj = "" + SerenityRest.lastResponse().jsonPath().get("error");
		SerenityRest.lastResponse().prettyPeek();
		System.out.println("Status: " + status);
		System.out.println("Error: " + postMsj);
		
		if (status.equals(intStatus) && strMsj.equals(postMsj) )
			return true;
		return false;
	}

	public static ValidateIDMsj with (Integer intStatus, String strMsj) {
		return new ValidateIDMsj (intStatus, strMsj);
	}
}
