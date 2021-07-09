package com.sophos.semillero.tasks;

import com.sophos.semillero.exceptions.ExceptionMsg;
import com.sophos.semillero.model.OrderCardModel;
import com.sophos.semillero.model.OrderUserInfoModel;
import com.sophos.semillero.model.RegisterModel;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.CheckoutPage;
import com.sophos.semillero.ui.ConfirmOrderPage;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;
import com.sophos.semillero.ui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateBillingInfoInConfirmOrder implements Task {

	public ValidateBillingInfoInConfirmOrder() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		String strOrderDate = ConfirmOrderPage.TXT_ORDER_DATE.resolveFor(theActorInTheSpotlight()).getText();
		actor.remember("strOrderDate", strOrderDate);
		
		OrderUserInfoModel ouimInfo = actor.recall("ouimInfo");
		// Validate that billing and shipping info match user info
		actor.should(
				seeThat(TextObtained.in(ConfirmOrderPage.TXT_BILLING_FIRST_NAME),
				IsEqual.equalTo(ouimInfo.getStrFirstNameBilling())).orComplainWith(
						ExceptionMsg.class, "Error when trying match for billing first name when confirming order"),
				seeThat(TextObtained.in(ConfirmOrderPage.TXT_BILLING_LAST_NAME),
						IsEqual.equalTo(ouimInfo.getStrLastNameBilling())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing last name when confirming order"),
				seeThat(TextObtained.in(ConfirmOrderPage.TXT_BILLING_ADDRESS_1),
						IsEqual.equalTo(ouimInfo.getStrAddress1Billing())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing address 1 when confirming order"),
				seeThat(TextObtained.in(ConfirmOrderPage.TXT_BILLING_ADDRESS_2),
						IsEqual.equalTo(ouimInfo.getStrAddress2Billing())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing address 2 when confirming order"),
				seeThat(TextObtained.in(ConfirmOrderPage.TXT_BILLING_CITY),
						IsEqual.equalTo(ouimInfo.getStrCityBilling())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing city when confirming order"),
				seeThat(TextObtained.in(ConfirmOrderPage.TXT_BILLING_STATE),
						IsEqual.equalTo(ouimInfo.getStrStateBilling())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing state when confirming order"),
				seeThat(TextObtained.in(ConfirmOrderPage.TXT_BILLING_ZIP),
						IsEqual.equalTo(ouimInfo.getStrZipBilling())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing zip code when confirming order"),
				seeThat(TextObtained.in(ConfirmOrderPage.TXT_BILLING_COUNTRY),
						IsEqual.equalTo(ouimInfo.getStrCountryBilling())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing country when confirming order"),
				
				seeThat(TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_FIRST_NAME),
						IsEqual.equalTo(ouimInfo.getStrFirstNameShipping())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for shipping first name when confirming order"),
						seeThat(TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_LAST_NAME),
								IsEqual.equalTo(ouimInfo.getStrLastNameShipping())).orComplainWith(
										ExceptionMsg.class, "Error when trying match for shipping last name when confirming order"),
						seeThat(TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_ADDRESS_1),
								IsEqual.equalTo(ouimInfo.getStrAddress1Shipping())).orComplainWith(
										ExceptionMsg.class, "Error when trying match for shipping address 1 when confirming order"),
						seeThat(TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_ADDRESS_2),
								IsEqual.equalTo(ouimInfo.getStrAddress2Shipping())).orComplainWith(
										ExceptionMsg.class, "Error when trying match for shipping address 2 when confirming order"),
						seeThat(TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_CITY),
								IsEqual.equalTo(ouimInfo.getStrCityShipping())).orComplainWith(
										ExceptionMsg.class, "Error when trying match for shipping city when confirming order"),
						seeThat(TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_STATE),
								IsEqual.equalTo(ouimInfo.getStrStateShipping())).orComplainWith(
										ExceptionMsg.class, "Error when trying match for shipping state when confirming order"),
						seeThat(TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_ZIP),
								IsEqual.equalTo(ouimInfo.getStrZipShipping())).orComplainWith(
										ExceptionMsg.class, "Error when trying match for shipping zip code when confirming order"),
						seeThat(TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_COUNTRY),
								IsEqual.equalTo(ouimInfo.getStrCountryShipping())).orComplainWith(
										ExceptionMsg.class, "Error when trying match for shipping country when confirming order")
				);
	}

	public static ValidateBillingInfoInConfirmOrder ofUser() {
		return instrumented(ValidateBillingInfoInConfirmOrder.class);
	}

}
