package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.models.ItemAnimal;
import com.sophossolutions.models.ItemOrderInvoice;
import com.sophossolutions.questions.IdProducAnima;
import com.sophossolutions.questions.InfoOfDateToday;
import com.sophossolutions.tasks.GetInfoOrder;

import static com.sophossolutions.ui.BillPaymentPage.TXT_INFO_ORDER;
import static com.sophossolutions.ui.BillPaymentPage.TXT_ITEM_ID;
import static com.sophossolutions.ui.CarPage.BTN_PROCEED_TO_CHECK;
import static com.sophossolutions.ui.NewOrderFormPage.BTN_CONTINUE;
import static com.sophossolutions.ui.OrderPage.BTN_CONFIRM;
import static com.sophossolutions.util.Constants.MODEL_ANIMAL;
import static com.sophossolutions.util.Constants.MODEL_ORDER;
import static com.sophossolutions.util.Constants.ACTOR_NAME;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class FinishBuyRequestStepDefinition {
	private String strActorName = ACTOR_NAME;

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("Must go to invoice")
	public void mustGoToInvoice() {
		theActorCalled(strActorName).wasAbleTo(Click.on(BTN_PROCEED_TO_CHECK),
				Click.on(BTN_CONTINUE), Click.on(BTN_CONFIRM));
	}

	@When("Must extract the information from the invoice")
	public void mustExtractTheInformationFromTheInvoice() {
		theActorInTheSpotlight().wasAbleTo(GetInfoOrder.animal());
	}

	@Then("Validate the date and generate id")
	public void validateTheDateAndGenerateId() {
		ItemOrderInvoice itemOrder = theActorInTheSpotlight().recall(MODEL_ORDER);
		theActorInTheSpotlight().should(seeThat(InfoOfDateToday.with(TXT_INFO_ORDER, 2),
				IsEqual.equalTo(itemOrder.getStrDate())));
		
		ItemAnimal infoAnimal = theActorInTheSpotlight().recall(MODEL_ANIMAL);
		theActorInTheSpotlight().should(seeThat(IdProducAnima.with(TXT_ITEM_ID),
				IsEqual.equalTo(infoAnimal.getItemID())));
	}
}
