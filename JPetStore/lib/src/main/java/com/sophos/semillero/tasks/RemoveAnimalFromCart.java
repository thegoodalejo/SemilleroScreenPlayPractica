package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RemoveAnimalFromCart implements Task {

	private String strItemId;

	public RemoveAnimalFromCart(String strItemId) {
		this.strItemId = strItemId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(CartPage.BTN_REMOVE_ITEM.of(strItemId))
				);
	}

	public static RemoveAnimalFromCart usingButtonForID(String strItemId) {
		return instrumented(RemoveAnimalFromCart.class, strItemId);
	}

}