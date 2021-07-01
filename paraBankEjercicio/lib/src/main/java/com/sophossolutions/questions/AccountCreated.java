package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class AccountCreated implements Question<String> {
	
	private Target TarInput;
	
	AccountCreated(Target targeInput){
		this.TarInput = targeInput; 
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TarInput).viewedBy(actor).asString();
	}

	public static AccountCreated exist(Target targetIn) {
		return new AccountCreated(targetIn);
	}
	

}
