package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class AmountOfElements implements Question<Integer> {

	private Target tarOrigen;
	
	public AmountOfElements(Target tarOrigen) {
		this.tarOrigen = tarOrigen;
	}
	
	@Override
	public Integer answeredBy(Actor actor) {
		return tarOrigen.resolveAllFor(actor).size();
	}
	
	public static AmountOfElements in(Target tarOrigen) {
		return new AmountOfElements(tarOrigen);
	}

}
