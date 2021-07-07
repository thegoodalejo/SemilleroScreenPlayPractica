package com.grupo3.questions;

import com.grupo3.ui.CartViewPage;
import static com.grupo3.util.RemoveCharacters.keepCharacters;
import com.grupo3.util.RemoveDollarSign;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.grupo3.questions.NumberOfItem.numberOfItem;

public class TheItemsInTheCart implements Question<Boolean>{
	
	private double total;
	
	public TheItemsInTheCart() {
		this.total = 0;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		int amt = actor.asksFor(AmountOfElements.in(CartViewPage.ITEMS_IN_CART));
		for (int i = 1; i <= amt; i++) {
			int quantity = actor.asksFor(numberOfItem(i));
			double listPrice = RemoveDollarSign.from(CartViewPage.getListPrice(i).resolveFor(actor).getText());
			if(quantity*listPrice != RemoveDollarSign.from(Text.of(CartViewPage.getTotalCost(i)).viewedBy(actor).asString())){
				return false;
			}
			total += quantity*listPrice;
		}
		
		return total == Double.parseDouble(keepCharacters(12).through(17).ofString(Text.of(CartViewPage.TOTAL_VALUE).viewedBy(actor).asString()));
	}
	
	public static TheItemsInTheCart areCongruent() {
		return new TheItemsInTheCart();
	}
	
}
