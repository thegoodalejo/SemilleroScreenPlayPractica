package com.sophossolutions.questions;

import com.sophossolutions.ui.AccountsPage;
import com.sophossolutions.ui.NewAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateLogin implements Question {

	private Target strWelcome;
	


	public ValidateLogin(Target strWelcome) {
		this.strWelcome = strWelcome;
	}
	
	public static ValidateLogin textWelcome(Target strWelcome) {
		return new ValidateLogin(strWelcome);
	}
	
	public Boolean answeredBy(Actor actor) {
		return Visibility.of(strWelcome).viewedBy(actor).asBoolean();
		
	}

}
