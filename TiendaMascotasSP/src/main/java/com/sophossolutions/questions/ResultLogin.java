package com.sophossolutions.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ResultLogin implements Question<String>{
	
	private Target strObtenido;

	public ResultLogin(Target stobte) {
		this.strObtenido = stobte;
	} 
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(strObtenido).viewedBy(actor).asString();
	}
	public static ResultLogin in(Target text) {
		return new ResultLogin(text);
	}

}
