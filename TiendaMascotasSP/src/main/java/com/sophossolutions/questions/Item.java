package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Item implements Question<String>{
	
	private Target idItem;
	
	public Item(Target idItem) {
		this.idItem = idItem;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(idItem).viewedBy(actor).asString();
	}

	public static Item inCar(Target Text) {
		return new Item(Text);
	}

}
