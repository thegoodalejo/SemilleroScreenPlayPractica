package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.CartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ChangeAmount implements Task{
	
	private int intAmount;
	private String strIdItem;

	public ChangeAmount(String strIdItem,int intAmount) {
		this.intAmount = intAmount;
		this.strIdItem = strIdItem;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(String.valueOf(intAmount)).into(CartPage.TXT_UPDATE_QUANTITY.of(strIdItem)),
				Click.on(CartPage.BTN_UPDATE));
	}

	public static ChangeAmount in(String strIdItem, int intAmount) {

		return instrumented(ChangeAmount.class, strIdItem, intAmount);
	}
	
}
