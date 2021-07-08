package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.StoreCar.LIST_PETSCAR;
import static com.sophossolutions.ui.StoreRegister.LIST_DATAACCOUNT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.hamcrest.core.IsEqual;
import com.sophossolutions.interactions.AddPets;
import com.sophossolutions.questions.ValidateDataAccountFacture;
import com.sophossolutions.questions.ValidateDataOrderFacture;
import com.sophossolutions.questions.ValidateDataPetsFacture;
import com.sophossolutions.tasks.StoreFinishBuy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreFinishBuyStepDefinitions {

	@Given("I want finish the purchase of pet (.+) (.+) (.+)$")
	public void iWantFinishThePurchaseOfPet(String strType, String strBreed, String strDescription) {
		theActorInTheSpotlight().wasAbleTo(AddPets.with(strType, strBreed, strDescription));
	}

	@When("the pets are in the shopping cart, I finish the purchase")
	public void thePetsAreInTheShoppingCartIFinishThePurchase() {
		theActorInTheSpotlight().wasAbleTo(StoreFinishBuy.withValidationof(LIST_DATAACCOUNT, LIST_PETSCAR));
	}

	@Then("I verify that the invoice matches what was entered")
	public void iVerifyThatTheInvoiceMatchesWhatWasEntered() {
		
		String[] strDataOrder= theActorInTheSpotlight().recall("strDataOrder");
		
		theActorInTheSpotlight().should(seeThat(ValidateDataAccountFacture.with("dataCurrentAccountFacture"), IsEqual.equalTo(true)));
		theActorInTheSpotlight().should(seeThat(ValidateDataOrderFacture.withData(strDataOrder), IsEqual.equalTo(true)));
		theActorInTheSpotlight().should(seeThat(ValidateDataPetsFacture.with("dataPetsOrder"), IsEqual.equalTo(true)));
		
	}
}
