package com.grupo3.questions;

import com.grupo3.ui.CartViewPage;
import com.grupo3.util.RemoveDollarSign;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.grupo3.questions.NumberOfItem.numberOfItem;

public class TheItemsInTheCart implements Question<Boolean>{
	
	private int total;
	
	public TheItemsInTheCart() {
		this.total = 0;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		int amt = actor.asksFor(AmountOfElements.in(CartViewPage.ITEMS_IN_CART));
		for (int i = 1; i <= amt; i++) {
			int quantity = actor.asksFor(numberOfItem(i));
			double listPrice = RemoveDollarSign.from(CartViewPage.getListPrice(i).resolveFor(actor).getValue());
		}
		return Boolean.TRUE;
	}
	
	public static TheItemsInTheCart areCongruent() {
		return new TheItemsInTheCart();
	}
	
}
