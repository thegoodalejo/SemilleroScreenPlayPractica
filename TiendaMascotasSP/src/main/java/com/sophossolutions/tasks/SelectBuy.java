package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.CartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectBuy implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(CartPage.BTN_PROCEED));
	}

	public static SelectBuy in() {

		return instrumented(SelectBuy.class);
	}

}