package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class AccNum implements Question<String>{

	private Target NumeroCuenta;
	
	public AccNum(Target numeroCuenta) {
		this.NumeroCuenta = numeroCuenta;
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(NumeroCuenta).viewedBy(actor).asString();
	}

	public static AccNum in(Target numeroCuenta) {
		return new AccNum(numeroCuenta);
	}
}
