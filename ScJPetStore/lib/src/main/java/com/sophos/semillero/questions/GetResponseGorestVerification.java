package com.sophos.semillero.questions;


import java.util.HashMap;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetResponseGorestVerification implements Question<Boolean> {

	private Integer intStatus;
	
	public GetResponseGorestVerification(Integer intStatus) {
		this.intStatus = intStatus;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {	
				
		try {
						
			Integer intStatusResponse = SerenityRest.lastResponse().jsonPath().getInt("code");
			HashMap<String,Integer> map =  (HashMap<String,Integer>) SerenityRest.lastResponse().jsonPath().getMap("meta").get("pagination");
			
			System.out.println("TOTAL POSTS: " + map.get("total"));
						
			return intStatus.equals(intStatusResponse);					
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public static GetResponseGorestVerification with(Integer intStatus) {		
		return new GetResponseGorestVerification(intStatus);
	}
	
}
