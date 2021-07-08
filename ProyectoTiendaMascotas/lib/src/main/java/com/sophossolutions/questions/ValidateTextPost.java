package com.sophossolutions.questions;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTextPost implements Question{
	private String strResponse,strToken;

	public ValidateTextPost(String strResponse, String strToken) {
		super();
		this.strResponse = strResponse;
		this.strToken = strToken;
	}
	@Override
	public Boolean answeredBy(Actor actor) {		
		JsonObject objectJson = JsonParser.parseString(strResponse).getAsJsonObject();
		String s = objectJson.get("token").getAsString();
		return (strToken.equals(objectJson.get("token").getAsString()));
	}

	public static ValidateTextPost was(String strResponse, String strToken) {
		return new ValidateTextPost(strResponse,strToken);
	}
}
