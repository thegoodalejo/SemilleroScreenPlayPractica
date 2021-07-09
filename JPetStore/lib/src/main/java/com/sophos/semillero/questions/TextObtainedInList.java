package com.sophos.semillero.questions;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TextObtainedInList implements Question<String>{

	private Target target;
	private String text;

	public TextObtainedInList(Target target, String text) {
		this.target = target;
		this.text = text;
	}

	@Override
	public String answeredBy(Actor actor) {
		List<?> names = target.resolveAllFor(actor);
		for (int i = 2; i < names.size(); i++) {
			target = Target.the("ID Item Cart").locatedBy("//tbody//tr[" + i + "]//td[1]//a");
			String textCart = target.resolveFor(actor).getText();
			if (textCart.equals(text)) {
				return textCart;
			}
		}
		return "";
	}
	
	public static TextObtainedInList in(Target target, String text) {
		return new TextObtainedInList(target, text);
	}
}
