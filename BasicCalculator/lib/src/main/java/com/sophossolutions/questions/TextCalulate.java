package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TextCalulate implements Question<String> {

	private Object dataIn;
	
	public TextCalulate(Object dataIn) {
		super();
		this.dataIn = dataIn;
	}

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return dataIn.toString();
	}

	public static TextCalulate in(Object object) {
		// TODO Auto-generated method stub
		return new TextCalulate(object);
	}

}
