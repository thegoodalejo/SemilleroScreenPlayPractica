package com.grupo3.questions;

import java.util.Iterator;

import org.openqa.selenium.NoSuchElementException;

import com.grupo3.model.Animal;
import com.grupo3.ui.CartViewPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnimalsInCart implements Question<Boolean>{

	Animal added;
	public AnimalsInCart(Animal a) {
		this.added = a;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		try {
			for (WebElementFacade el : CartViewPage.ITEMS_IN_CART.resolveAllFor(actor)) {
				if (el.getText().equals(added.getItemID())) {
					return true;
				}
			}
			
		} catch(NoSuchElementException e) {
			return false;
		}
		
		return false;
	}
	
	public static AnimalsInCart contains(Animal a) {
		return new AnimalsInCart(a);
	}
	
	public static AnimalsInCart containsAnimalAddedByActor(Actor a) {
		return new AnimalsInCart(a.recall("ADDED_ANIMAL"));
	}

}
