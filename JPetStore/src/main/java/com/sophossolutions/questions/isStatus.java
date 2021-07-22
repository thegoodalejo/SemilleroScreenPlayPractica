package com.sophossolutions.questions;

import static com.sophossolutions.util.Constants.INDEX_STATUS_CODE;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class isStatus implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return actor.recall(INDEX_STATUS_CODE).toString();
	}

	public static isStatus code() {
		// TODO Auto-generated method stub
		return new isStatus();
	}

}
