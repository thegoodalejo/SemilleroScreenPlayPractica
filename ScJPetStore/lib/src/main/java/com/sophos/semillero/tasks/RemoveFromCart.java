package com.sophos.semillero.tasks;

import com.sophos.semillero.interactions.SaveModel;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.CatalogPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RemoveFromCart implements Task {

	private String itemId;

	public RemoveFromCart(String itemId) {
		super();
		this.itemId = itemId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(CatalogPage.BTN_CART),
				Click.on(CartPage.BTN_REMOVE_ITEM.of(itemId)),
				SaveModel.deletedItemCart("CART", itemId)
				);
		
	}

	public static RemoveFromCart itemWithId(String itemId) {
		return instrumented(RemoveFromCart.class, itemId);		
	}


}