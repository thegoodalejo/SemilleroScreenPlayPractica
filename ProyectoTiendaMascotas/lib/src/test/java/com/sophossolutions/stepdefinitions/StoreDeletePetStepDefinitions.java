package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.StoreCar.PET_SELECTED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.exceptions.ExceptionMessage;
import com.sophossolutions.interactions.ClickButton;
import com.sophossolutions.questions.TextOf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreDeletePetStepDefinitions {
	
	@When("i delete the pet in the shopping cart")
	public void iDeleteThePetInTheShoppingCart() {
	    theActorInTheSpotlight().wasAbleTo(ClickButton.elementTarget(null));
	}

	@Then("I verified that the pet is not in the shopping cart")
	public void iVerifiedThatThePetIsNotInTheShoppingCart() {
		theActorInTheSpotlight().should(seeThat(TextOf.in(null), IsEqual.equalTo(""))
				.orComplainWith(ExceptionMessage.class, "Ha ocurrido un error"));
	}


}
