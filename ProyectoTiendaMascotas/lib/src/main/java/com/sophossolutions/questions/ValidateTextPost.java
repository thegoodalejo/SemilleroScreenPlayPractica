package com.sophossolutions.questions;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTextPost implements Question{
	private String strResponse,strText,strAtrribute;

	public ValidateTextPost(String strResponse, String strText,String strAtrribute) {
		super();
		this.strResponse = strResponse;
		this.strText = strText;
		this.strAtrribute = strAtrribute;
	}
	@Override
	public Boolean answeredBy(Actor actor) {		
		JsonObject objectJson = JsonParser.parseString(strResponse).getAsJsonObject();
		String s = objectJson.get(strAtrribute).getAsString();
		return (strText.equals(objectJson.get(strAtrribute).getAsString()));
	}

	public static ValidateTextPost was(String strResponse, String strText, String strAtrribute) {
		return new ValidateTextPost(strResponse,strText,strAtrribute);
	}
}
