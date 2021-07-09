package com.sophos.semillero.tasks;

import com.sophos.semillero.exceptions.ExceptionMsg;
import com.sophos.semillero.model.CardModel;
import com.sophos.semillero.model.RegisterModel;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.CheckoutPage;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;
import com.sophos.semillero.ui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateBillingInfo implements Task {

	public ValidateBillingInfo() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		RegisterModel rmNewUser = actor.recall("rmNewUser");
		actor.should(
				seeThat(TextObtained.in(CheckoutPage.TXT_FIRST_NAME),
				IsEqual.equalTo(rmNewUser.getStrFirstName())).orComplainWith(
						ExceptionMsg.class, "Error when trying match for billing first name"),
				seeThat(TextObtained.in(CheckoutPage.TXT_LAST_NAME),
						IsEqual.equalTo(rmNewUser.getStrLastName())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing last name"),
				seeThat(TextObtained.in(CheckoutPage.TXT_ADDRESS_1),
						IsEqual.equalTo(rmNewUser.getStrAddress1())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing address 1"),
				seeThat(TextObtained.in(CheckoutPage.TXT_ADDRESS_2),
						IsEqual.equalTo(rmNewUser.getStrAddress2())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing address 2"),
				seeThat(TextObtained.in(CheckoutPage.TXT_CITY),
						IsEqual.equalTo(rmNewUser.getStrCity())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing city"),
				seeThat(TextObtained.in(CheckoutPage.TXT_STATE),
						IsEqual.equalTo(rmNewUser.getStrState())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing state"),
				seeThat(TextObtained.in(CheckoutPage.TXT_ZIP),
						IsEqual.equalTo(String.valueOf(rmNewUser.getIntZip()))).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing zip code"),
				seeThat(TextObtained.in(CheckoutPage.TXT_COUNTRY),
						IsEqual.equalTo(rmNewUser.getStrCountry())).orComplainWith(
								ExceptionMsg.class, "Error when trying match for billing country")
				);
	}

	public static ValidateBillingInfo ofUser() {
		return instrumented(ValidateBillingInfo.class);
	}

}
