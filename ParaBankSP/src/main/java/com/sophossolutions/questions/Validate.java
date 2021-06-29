package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Validate implements Question<String>{

	private Target strNumCuenta;

	public Validate(Target strNumCuenta) {
		this.strNumCuenta = strNumCuenta;
	}

	@Override
	public String answeredBy(Actor actor) {
		System.out.println("Numero de cuenta: "+Text.of(strNumCuenta).viewedBy(actor).asString());
		return "validado";
	}
	
	public static Validate account(Target txtNumero) {
		return new Validate(txtNumero);
	}

}
