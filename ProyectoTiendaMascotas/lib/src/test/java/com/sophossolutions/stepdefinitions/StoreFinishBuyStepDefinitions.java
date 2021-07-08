package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.sophossolutions.interactions.ClickButton;
import com.sophossolutions.interactions.AddPets;
import com.sophossolutions.tasks.StoreFinishBuy;
import static com.sophossolutions.ui.StoreCar.LIST_PETSCAR;
import static com.sophossolutions.ui.StoreRegister.LIST_DATAACCOUNT;

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
		System.out.println("@THEN");
	}
}
