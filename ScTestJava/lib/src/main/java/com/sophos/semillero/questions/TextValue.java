package com.sophos.semillero.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextValue implements Question<String>{

	public static String NumeroCuenta;
	private Target NumerocuentaT;
	
	
	public TextValue(Target numeroCuenta) {
		this.NumerocuentaT = numeroCuenta;
	}
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(NumerocuentaT).viewedBy(actor).asString();
	}
	
	public static TextValue  in(Target numeroCuenta) {
		return new TextValue(numeroCuenta);
	}
	
}
