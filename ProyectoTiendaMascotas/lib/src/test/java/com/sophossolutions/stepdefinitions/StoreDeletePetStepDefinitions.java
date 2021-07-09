package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.StoreCar.BTN_REMOVE;
import static com.sophossolutions.ui.StoreCar.BTN_SHOPPINGCAR;
import static com.sophossolutions.ui.StoreHome.BTN_HOME;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.time.Duration;

import com.sophossolutions.interactions.ClickButton;
import com.sophossolutions.tasks.SaveInfo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

public class StoreDeletePetStepDefinitions {
	String strDel;

	@When("i delete the pet in the shopping cart (.+)$")
	public void iDeleteThePetInTheShoppingCart(String strDes) {
		theActorInTheSpotlight().wasAbleTo(ClickButton.elementTarget(BTN_HOME),
				ClickButton.elementTarget(BTN_SHOPPINGCAR), SaveInfo.on(BTN_REMOVE.of(strDes)),
				ClickButton.elementTarget(BTN_REMOVE.of(strDes)));

		strDel = theActorInTheSpotlight().recall("TextElement");
	}

	@Then("I verified that the pet is not in the shopping cart")
	public void iVerifiedThatThePetIsNotInTheShoppingCart() {
		theActorInTheSpotlight()
				.has(Ensure.that(BTN_REMOVE.of(strDel).waitingForNoMoreThan(Duration.ofSeconds(5))).isNotDisplayed());

	}

}