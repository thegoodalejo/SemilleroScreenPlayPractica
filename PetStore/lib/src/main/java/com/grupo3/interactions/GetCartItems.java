package com.grupo3.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.grupo3.model.Animal;
import com.grupo3.model.ShoppingCart;
import com.grupo3.questions.AmountOfElements;
import com.grupo3.ui.CartViewPage;

public class GetCartItems implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		int amt = actor.asksFor(AmountOfElements.in(CartViewPage.ITEMS_IN_CART));
		ShoppingCart cart = new ShoppingCart();
		for (int i = 1; i < amt+1; i++) {
			Animal a = new Animal(
						Text.of(CartViewPage.getItemID(i)).viewedBy(actor).asString(),
						Text.of(CartViewPage.getProductID(i)).viewedBy(actor).asString(),
						Text.of(CartViewPage.getDescription(i)).viewedBy(actor).asString(),
						Text.of(CartViewPage.getListPrice(i)).viewedBy(actor).asString()
					);
			cart.addToCart(a);
					
		}
		actor.remember("SHOPPING_CART", cart);
		
	}
	
	public static GetCartItems rememberTheItemsInTheCart() {
		return instrumented(GetCartItems.class);
	}

}
