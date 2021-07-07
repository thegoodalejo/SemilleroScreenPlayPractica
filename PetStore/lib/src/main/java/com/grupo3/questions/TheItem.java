package com.grupo3.questions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;

import com.grupo3.model.Animal;
import com.grupo3.ui.CartViewPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class TheItem implements Question<Boolean>{

	private Animal item;
	
	public TheItem(Animal a) {
		this.item = a;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		List<WebElementFacade> l;
		try {
			l =  CartViewPage.ITEMS_IN_CART.resolveAllFor(actor);			
		} catch(NoSuchElementException e) {
			return false;
		}
		
		for (WebElementFacade w : l) {
			if (w.getText().equals(item.getItemID())) {
				return false;
			}
		}
		return true;
		
	}
	
	public static TheItem theItemWithTheAnimal(Animal a) {
		return new TheItem(a);
	}
	
	public TheItem isNoLongerInTheCart() {
		return this;
	}
	
	
}
