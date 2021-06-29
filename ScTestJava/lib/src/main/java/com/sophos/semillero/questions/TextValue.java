package com.sophos.semillero.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextValue implements Question<String>{

	public static String NumeroCuenta;
	private Target NumerocuentaT;
	private Target Balance;
	
	public TextValue(Target numeroCuenta, Target balance) {
		this.NumerocuentaT = numeroCuenta;
		this.Balance = balance;
	}
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(NumerocuentaT).viewedBy(actor).asString();
	}
	
	public static TextValue  in(Target numeroCuenta, Target balance) {
		return new TextValue(numeroCuenta,balance);
	}
	
}
