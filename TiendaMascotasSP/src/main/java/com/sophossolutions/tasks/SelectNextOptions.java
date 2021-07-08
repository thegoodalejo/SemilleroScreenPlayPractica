package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.CartPage;
import com.sophossolutions.ui.ConfirmOrderPage;
import com.sophossolutions.ui.PaymentPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectNextOptions implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
	 
		actor.attemptsTo(Click.on(PaymentPage.BTN_CONTINUE),
				         Click.on(ConfirmOrderPage.BTN_CONFIRM));	
	}
	
	public static SelectNextOptions in() {

		return instrumented(SelectNextOptions.class);
	}
}
