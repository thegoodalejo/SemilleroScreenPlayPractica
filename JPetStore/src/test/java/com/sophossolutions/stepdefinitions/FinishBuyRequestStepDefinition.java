package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;
import org.mockito.internal.matchers.Contains;

import com.sophossolutions.models.ItemOrderInvoice;
import com.sophossolutions.models.ItemShopCar;
import com.sophossolutions.questions.IdProduc;
import com.sophossolutions.questions.IdProducAnima;
import com.sophossolutions.questions.InfoOfDateToday;
import com.sophossolutions.tasks.GetInfoOrder;
import com.sophossolutions.ui.BillPaymentPage;
import com.sophossolutions.ui.CarPage;
import com.sophossolutions.ui.NewOrderFormPage;
import com.sophossolutions.ui.OrderPage;
import com.sophossolutions.util.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class FinishBuyRequestStepDefinition {
	private String strActorName = Constants.ACTOR_NAME;

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("Must go to invoice")
	public void mustGoToInvoice() {
		theActorCalled(strActorName).wasAbleTo(Click.on(CarPage.BTN_PROCEED_TO_CHECK),
				Click.on(NewOrderFormPage.BTN_CONTINUE), Click.on(OrderPage.BTN_CONFIRM));
	}

	@When("Must extract the information from the invoice")
	public void mustExtractTheInformationFromTheInvoice() {
		theActorInTheSpotlight().wasAbleTo(GetInfoOrder.animal());
	}

	@Then("Validate the date and generate id")
	public void validateTheDateAndGenerateId() {
		ItemOrderInvoice itemOrder = theActorInTheSpotlight().recall(Constants.MODEL_ORDER);
		theActorInTheSpotlight().should(seeThat(InfoOfDateToday.with(BillPaymentPage.TXT_INFO_ORDER,2),
				IsEqual.equalTo(itemOrder.getStrDate())));
		
		ItemShopCar infoAnimal = theActorInTheSpotlight().recall(Constants.MODEL_CARRITO);
		theActorInTheSpotlight().should(seeThat(IdProducAnima.with(BillPaymentPage.TXT_ITEM_ID),
				IsEqual.equalTo(infoAnimal.getItemID())));
	}
}
