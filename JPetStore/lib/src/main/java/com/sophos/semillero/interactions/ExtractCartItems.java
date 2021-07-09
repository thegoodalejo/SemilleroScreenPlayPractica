package com.sophos.semillero.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.model.CartItemsModel;
import com.sophos.semillero.model.ItemModel;
import com.sophos.semillero.questions.AmountOfElements;
import com.sophos.semillero.ui.CartPage;

public class ExtractCartItems implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		int numElements = actor.asksFor(AmountOfElements.in(CartPage.CART_ITEMS));
		CartItemsModel cartItems;
		for (int i = 1; i <= numElements; i++) {
			int animalCount = actor.asksFor(numberOfItem(i));
			for (int j = 0; j < animalCount; j++) {
				Animal a = new Animal(Text.of(CartPage.getItemID(i)).viewedBy(actor).asString(),
						Text.of(CartPage.getProductID(i)).viewedBy(actor).asString(),
						Text.of(CartPage.getDescription(i)).viewedBy(actor).asString(),
						Text.of(CartPage.getListPrice(i)).viewedBy(actor).asString());
				cartItems.addToCart(a);
			}

		}
		actor.remember("SHOPPING_CART", cartItems);

	}

	public static ExtractCartItems rememberTheItemsInTheCart() {
		return instrumented(ExtractCartItems.class);
	}
	
	void addItemToCart() {
		
	}

}
