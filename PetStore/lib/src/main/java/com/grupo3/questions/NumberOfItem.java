package com.grupo3.questions;

import com.grupo3.ui.CartViewPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NumberOfItem implements Question<Integer>{

	private int i;
	
	public NumberOfItem(int i) {
		this.i = i;
	}

	@Override
	public Integer answeredBy(Actor actor) {
		return Integer.parseInt(CartViewPage.getAmountHolder(this.i).resolveFor(actor).getValue());
	}

	public static NumberOfItem numberOfItem(int i) {
		return new NumberOfItem(i);
	}
	
}
