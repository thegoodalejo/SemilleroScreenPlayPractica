package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ResultText implements Question<String> {
	
	private Target targetAnswer;
	
	public ResultText(Target targetAnswer) {
		super();
		this.targetAnswer = targetAnswer;
	}

	@Override
	public String answeredBy(Actor actor) {
		return targetAnswer.resolveFor(actor).getTextValue();
	}

	public static ResultText of(Target editTextAnswer) {
		// TODO Auto-generated method stub
		return new ResultText(editTextAnswer);
	}

}
