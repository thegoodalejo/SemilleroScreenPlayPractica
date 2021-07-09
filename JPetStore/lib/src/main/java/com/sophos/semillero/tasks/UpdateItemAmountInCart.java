package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class UpdateItemAmountInCart implements Task {

	private int intNewItemAmount;
	private Target tagUpdatedItem;

	public UpdateItemAmountInCart(int intNewItemAmount, Target tagUpdatedItem) {
		this.intNewItemAmount = intNewItemAmount;
		this.tagUpdatedItem = tagUpdatedItem;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(String.valueOf(intNewItemAmount)).into(tagUpdatedItem),
				Click.on(CartPage.BTN_UPDATE_CART)
				);
	}

	public static UpdateItemAmountInCart usingField(int intNewItemAmount, Target tagUpdatedItem) {
		return instrumented(UpdateItemAmountInCart.class, intNewItemAmount, tagUpdatedItem);
	}

}
