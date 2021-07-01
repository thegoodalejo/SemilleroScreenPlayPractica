package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextObtained implements Question<String>{
	
	private Target targetObtained;
	
	TextObtained(Target targetValidate){
		this.targetObtained = targetValidate;
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(targetObtained).viewedBy(actor).asString();
	}

	public static TextObtained inTitlePage(Target targetValidate) {
		return new TextObtained(targetValidate);
	}

}
