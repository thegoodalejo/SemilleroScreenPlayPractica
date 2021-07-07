package com.grupo3.questions;

import org.openqa.selenium.NoSuchElementException;

import com.grupo3.ui.CartViewPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AmountOfItemsInCart implements Question<Boolean>{
	
	int atLeast;
	
	public AmountOfItemsInCart(int i) {
		this.atLeast = i;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		try {
			return CartViewPage.ITEMS_IN_CART.resolveAllFor(actor).size() >= this.atLeast;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public static AmountOfItemsInCart isAtLeast(int i) {
		return new AmountOfItemsInCart(i);
	}
	

}
