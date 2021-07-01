package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Print implements Question<String>{

	private Target strSaldoCuenta;

	public Print(Target strSaldoCuenta) {
		this.strSaldoCuenta = strSaldoCuenta;
	}

	@Override
	public String answeredBy(Actor actor) {
		System.out.println("Saldo en la cuenta: "+Text.of(strSaldoCuenta).viewedBy(actor).asString());
		return Text.of(strSaldoCuenta).viewedBy(actor).asString();
	}
	
	public static Print available(Target txtSaldo) {
		return new Print(txtSaldo);
	}
	
}
