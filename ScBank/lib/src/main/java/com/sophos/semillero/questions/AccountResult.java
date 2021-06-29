package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class AccountResult implements Question<String> {

	private Target strNumberAccount;
	
	public AccountResult(Target target) {
		this.strNumberAccount = target;
	}
	
	@Override
	public String answeredBy(Actor actor) {	
		return Text.of(strNumberAccount).viewedBy(actor).asString();
	}
	
	public static AccountResult in(Target target) {
		return new AccountResult(target);
	}
	
}
