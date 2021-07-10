package com.sophos.semillero.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateIDStatus implements Question<Boolean> {

	String intStatus; 
	String strID;
	
	public ValidateIDStatus (Integer intStatus, String strID) {
		this.intStatus = intStatus.toString();
		this.strID = strID;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		String status = SerenityRest.lastResponse().getStatusCode()+"";
		String postMsj = "" + SerenityRest.lastResponse().jsonPath().get("data.id");
		SerenityRest.lastResponse().prettyPeek();
		System.out.println("Status: " + status);
		System.out.println("ID: " + postMsj);
		
		if (status.equals(intStatus) && strID.equals(postMsj) )
			return true;
		return false;
	}

	public static ValidateIDStatus with (Integer intStatus, String strID) {
		return new ValidateIDStatus (intStatus, strID);
	}
}
