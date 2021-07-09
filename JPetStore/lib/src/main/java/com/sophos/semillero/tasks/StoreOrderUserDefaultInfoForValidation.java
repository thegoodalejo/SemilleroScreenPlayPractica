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

public class StoreOrderUserDefaultInfoForValidation implements Task {

	public StoreOrderUserDefaultInfoForValidation() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		String strFirstNameBilling = CheckoutPage.TXT_FIRST_NAME.resolveFor(theActorInTheSpotlight()).getText();
		String strLastNameBilling = CheckoutPage.TXT_LAST_NAME.resolveFor(theActorInTheSpotlight()).getText();
		String strAddress1Billing = CheckoutPage.TXT_ADDRESS_1.resolveFor(theActorInTheSpotlight()).getText();
		String strAddress2Billing = CheckoutPage.TXT_ADDRESS_2.resolveFor(theActorInTheSpotlight()).getText();
		String strCityBilling = CheckoutPage.TXT_CITY.resolveFor(theActorInTheSpotlight()).getText();
		String strStateBilling = CheckoutPage.TXT_STATE.resolveFor(theActorInTheSpotlight()).getText();
		String strZipBilling = CheckoutPage.TXT_ZIP.resolveFor(theActorInTheSpotlight()).getText();
		String strCountryBilling = CheckoutPage.TXT_COUNTRY.resolveFor(theActorInTheSpotlight()).getText();
		
		OrderUserInfoModel ouimInfo = new OrderUserInfoModel(strFirstNameBilling, strLastNameBilling,
				strAddress1Billing, strAddress2Billing, strCityBilling, strStateBilling, strZipBilling,
				strCountryBilling, strFirstNameBilling, strLastNameBilling, strAddress1Billing,
				strAddress2Billing, strCityBilling, strStateBilling, strZipBilling, strCountryBilling);
		actor.remember("ouimInfo", ouimInfo);
	}

	public static StoreOrderUserDefaultInfoForValidation fromForm() {
		return instrumented(StoreOrderUserDefaultInfoForValidation.class);
	}

}
