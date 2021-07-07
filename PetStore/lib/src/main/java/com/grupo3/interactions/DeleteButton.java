package com.grupo3.interactions;

import java.util.List;

import com.grupo3.model.Animal;
import com.grupo3.ui.CartViewPage;

import io.cucumber.java.bs.A;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class DeleteButton implements Question<Target>{

	Animal chosen;
	
	public DeleteButton(Animal a) {
		this.chosen = a;
	}
	
	@Override
	public Target answeredBy(Actor actor) {
		
		int itemInCartAmount = CartViewPage.ITEMS_IN_CART.resolveAllFor(actor).size();
		for (int i = 1; i <= itemInCartAmount; i++) {
			String id = Text.of(CartViewPage.getItemID(i)).viewedBy(actor).asString();
			if(id.equals(chosen.getItemID())) {
				return CartViewPage.getRemoveButton(i);
			}
		}
		return null;
		
	}
	
	public static DeleteButton forAnimal(Animal a) {
		return new DeleteButton(a);
	}
	
}
