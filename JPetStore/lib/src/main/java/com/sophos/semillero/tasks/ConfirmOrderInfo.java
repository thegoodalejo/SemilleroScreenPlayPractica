package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.CheckoutPage;
import com.sophos.semillero.ui.ConfirmOrderPage;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmOrderInfo implements Task {

	public ConfirmOrderInfo() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(StoreOrderUserDefaultInfoForValidation.fromForm(),
				GoToPageGivenByTarget.usingButtonOrLink(CheckoutPage.BTN_CONTINUE),
				ValidateBillingInfoInConfirmOrder.ofUser(),
				GoToPageGivenByTarget.usingButtonOrLink(ConfirmOrderPage.BTN_CONFIRM));
	}

	public static ConfirmOrderInfo matchesActualOrder() {
		return instrumented(ConfirmOrderInfo.class);
	}

}
