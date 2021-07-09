package com.sophos.semillero.tasks;

import com.sophos.semillero.model.OrderCardModel;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.CheckoutPage;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;
import com.sophos.semillero.ui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

public class EnterCardDetails implements Task {
	
	private OrderCardModel ocmUserCard;

	public EnterCardDetails(OrderCardModel ocmUserCard) {
		this.ocmUserCard = ocmUserCard;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				SelectFromOptions.byVisibleText(ocmUserCard.getStrCardType()).from(CheckoutPage.FORM_CARD_TYPE),
				Enter.theValue(ocmUserCard.getStrCardNumber()).into(CheckoutPage.TXT_CARD_NUMBER),
				Enter.theValue(ocmUserCard.getStrCardExpiryDate()).into(CheckoutPage.TXT_CARD_EXPIRY_DATE)
				);
	}

	public static EnterCardDetails ofTheirCard(OrderCardModel ocmUserCard) {
		return instrumented(EnterCardDetails.class, ocmUserCard);
	}

}
