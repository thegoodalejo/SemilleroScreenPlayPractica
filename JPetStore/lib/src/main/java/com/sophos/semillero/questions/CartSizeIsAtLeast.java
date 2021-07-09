package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class CartSizeIsAtLeast implements Question<Boolean> {

int atLeast;
	
	public AmountOfItemsInCart(int i) {
		this.atLeast = i;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		try {
			int inCart = 0;
			int amt = CartViewPage.ITEMS_IN_CART.resolveAllFor(actor).size();
			for (int i = 1; i <= amt; i++) {
				int itemAmt = actor.asksFor(numberOfItem(i));
				inCart += itemAmt;
			}
			return inCart >= this.atLeast;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public static AmountOfItemsInCart isAtLeast(int i) {
		return new AmountOfItemsInCart(i);
	}

}
