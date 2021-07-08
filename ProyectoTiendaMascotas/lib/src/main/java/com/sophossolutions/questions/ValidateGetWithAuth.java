package com.sophossolutions.questions;

import com.google.gson.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateGetWithAuth implements Question {

	private String strResponseData, strExpectedStatus;
	

	public ValidateGetWithAuth(String strResponseData, String strExpectedStatus) {
		super();
		this.strResponseData = strResponseData;
		this.strExpectedStatus = strExpectedStatus;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		Boolean boolValidation=true;
		
		JsonObject objectJson = JsonParser.parseString(strResponseData).getAsJsonObject();
		
		JsonArray arrayJson = (JsonArray) objectJson.get("data");
		
		for(int i= 0; i< arrayJson.size(); i ++) {			
			JsonObject objectJson2 = (JsonObject) arrayJson.get(i);
			
			if(objectJson2.get("status").getAsString().equals(strExpectedStatus)) {
				boolValidation = true;
			}
			else {
				boolValidation = false;
				break;
			}
		}
		
		return boolValidation;
	}
	
	public static ValidateGetWithAuth withStatus(String strResponseData,String strExpectedStatus) {
		return new ValidateGetWithAuth(strResponseData, strExpectedStatus);
	}
	

}
