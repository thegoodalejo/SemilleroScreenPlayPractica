package com.grupo3.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class AmountOfElements implements Question<Integer> {
	
	private Target target;
	
	public AmountOfElements(Target t) {
		this.target = t;
	}
	
	@Override
	public Integer answeredBy(Actor actor) {
		return target.resolveAllFor(actor).size();
	}
	
	public static AmountOfElements in(Target t) {
		return new AmountOfElements(t);
	}

}
