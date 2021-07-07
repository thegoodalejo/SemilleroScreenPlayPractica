package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateQuantitiesCar implements Question {

	private Target strCostTotal;
	
	public ValidateQuantitiesCar(Target strCostTotal) {
		super();
		this.strCostTotal = strCostTotal;
	}
	
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(strCostTotal).viewedBy(actor).asString();
	}
	
	public static ValidateQuantitiesCar withCostTotal(Target strCostTotal) {
		return new ValidateQuantitiesCar(strCostTotal);
	}

}
