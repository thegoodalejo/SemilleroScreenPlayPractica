package com.grupo3.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Value;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.grupo3.model.Address;
import com.grupo3.model.Purchase;
import com.grupo3.ui.PaymentPage;

public class GetBillingInfo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		Address addr = new Address(
					Value.of(PaymentPage.TXT_FNAME).viewedBy(actor).asString(),
					Value.of(PaymentPage.TXT_LNAME).viewedBy(actor).asString(),
					Value.of(PaymentPage.TXT_ADDR_1).viewedBy(actor).asString(),
					Value.of(PaymentPage.TXT_ADDR_2).viewedBy(actor).asString(),
					Value.of(PaymentPage.TXT_CITY).viewedBy(actor).asString(),
					Value.of(PaymentPage.TXT_STATE).viewedBy(actor).asString(),
					Value.of(PaymentPage.TXT_ZIP_CODE).viewedBy(actor).asString(),
					Value.of(PaymentPage.TXT_COUNTRY).viewedBy(actor).asString()
				);
		
		String cardType = Value.of(PaymentPage.CARD_TYPE_OPTION).viewedBy(actor).asString();
		String cardNumber = Value.of(PaymentPage.TXT_CARD_NUMBER).viewedBy(actor).asString();
		String cardExpiry = Value.of(PaymentPage.TXT_CARD_EXPIRY).viewedBy(actor).asString();
		
		boolean differentAddress = Value.of(PaymentPage.SEL_SHIP_TO_OTHER_ADDRESS).viewedBy(actor).asBoolean();
		
		if (differentAddress) {
			Purchase newPurchase = new Purchase(addr, cardNumber, cardType, cardExpiry);
			newPurchase.setShoppingCart(actor.recall("SHOPPING_CART"));
			actor.remember("NEW_PURCHASE", newPurchase);
		}
		
	}
	
	public static GetBillingInfo rememberThePurchaseInformation() {
		return instrumented(GetBillingInfo.class);
	}
	
}
