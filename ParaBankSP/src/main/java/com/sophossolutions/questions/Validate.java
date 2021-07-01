package com.sophossolutions.questions;

import com.sophossolutions.ui.AccountsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Validate implements Question<String>{

	private String strNumCuenta;

	public Validate(String strNumCuenta) {
		this.strNumCuenta = strNumCuenta;
	}

	@Override
	public String answeredBy(Actor actor) {
		String strSaldo = Text.of(AccountsPage.AVAILABLE_IN_TABLE.of(strNumCuenta)).viewedBy(actor).asString();
		System.out.println("Validada la cuenta: "+strNumCuenta+" con un saldo de: "+strSaldo);
		return "Validada la cuenta: "+strNumCuenta+" con un saldo de: "+strSaldo;
	}
	
	public static Validate account(String txtNumero) {
		return new Validate(txtNumero);
	}

}
