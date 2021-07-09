package com.sophossolutions.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class Info implements Question<String> {

	private String Path;

	public Info(String path) {
		this.Path = path;
	}

	@Override
	public String answeredBy(Actor actor) {
		String Data = SerenityRest.lastResponse().jsonPath().get(Path).toString();
		System.out.println(Data);
		return Data;
	}

	public static Info json(String path) {
		return new Info(path);
	}

}
