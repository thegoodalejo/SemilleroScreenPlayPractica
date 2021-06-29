package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebDriverQuestion;
import net.serenitybdd.screenplay.targets.Target;

import com.sophossolutions.ui.NewAccountPage;

public class ValidateNewAccount implements Question {

	private Target strIdNewAccount;
	
	public ValidateNewAccount(Target strIdNewAccount) {
		this.strIdNewAccount = strIdNewAccount;
	}
	
	public static ValidateNewAccount withId(Target strIdNewAccount) {
		return new ValidateNewAccount(strIdNewAccount);
	}
	
	public Boolean answeredBy(Actor actor) {
		
		
		return true;
				//Text.of(strIdNewAccount).viewedBy(actor).asString();
	}

}
