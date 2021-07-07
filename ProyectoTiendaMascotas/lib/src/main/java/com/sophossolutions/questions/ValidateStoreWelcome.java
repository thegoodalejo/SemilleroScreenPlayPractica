package com.sophossolutions.questions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateStoreWelcome implements Question {

	private Target strWelcome;
	
	
	public ValidateStoreWelcome(Target strWelcome) {
		super();
		this.strWelcome = strWelcome;
	}


	@Override
	public Object answeredBy(Actor actor) {
		return Visibility.of(strWelcome).viewedBy(actor).asBoolean();
	}
	
	public static ValidateStoreWelcome withText(Target strWelcome) {
		return new ValidateStoreWelcome(strWelcome);
	}

}
