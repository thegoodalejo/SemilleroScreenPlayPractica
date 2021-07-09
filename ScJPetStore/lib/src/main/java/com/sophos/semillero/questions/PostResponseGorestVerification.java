package com.sophos.semillero.questions;


import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PostResponseGorestVerification implements Question<Boolean> {

	private String strStatus;
	
	public PostResponseGorestVerification(String strStatus) {
		this.strStatus = strStatus;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {	
				
		try {
			
			String strUserId = actor.recall("USER_ID");
			
			String strStatusResponse = SerenityRest.lastResponse().jsonPath().get("code").toString();
			String strUserIdResponse = SerenityRest.lastResponse().jsonPath().getMap("data").get("id").toString();
						
			return strUserId.equals(strUserIdResponse) && strStatus.equals(strStatusResponse);					
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static PostResponseGorestVerification with(String strStatus) {		
		return new PostResponseGorestVerification(strStatus);
	}
	
}
