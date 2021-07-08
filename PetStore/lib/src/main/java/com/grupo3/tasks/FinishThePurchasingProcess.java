package com.grupo3.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.grupo3.interactions.GetCartItems.rememberTheItemsInTheCart;
import static com.grupo3.interactions.GetBillingInfo.rememberThePurchaseInformation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.grupo3.ui.CartViewPage;
import com.grupo3.ui.ConfirmationPage;
import com.grupo3.ui.MainPage;
import com.grupo3.ui.PaymentPage;

public class FinishThePurchasingProcess implements Task{

	private String username;
	private String password;
	
	public FinishThePurchasingProcess(String u, String p) {
		this.username = u;
		this.password = p;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
					Click.on(CartViewPage.BTN_CHECKOUT),
					Login.withCredentials(this.username, this.password),
					Click.on(MainPage.SHOPPING_CART_BUTTON),
					Click.on(CartViewPage.BTN_CHECKOUT),
					rememberThePurchaseInformation(),
					Click.on(PaymentPage.BTN_CONTINUE),
					Click.on(ConfirmationPage.BTN_CONFIRM)
				);
		
	}
	
	public static FinishThePurchasingProcess finishThePurchasingProcessWithCredentials(String username, String password) {
		return instrumented(FinishThePurchasingProcess.class, username, password);
	}

}
