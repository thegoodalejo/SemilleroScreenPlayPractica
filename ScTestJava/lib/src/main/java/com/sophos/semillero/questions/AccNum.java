package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class AccNum implements Question<String>{

	private Target Balance;
	
	public AccNum(Target balance) {
		this.Balance = balance;
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(Balance).viewedBy(actor).asString();
	}

	public static AccNum in(Target balance) {
		return new AccNum(balance);
	}
}
