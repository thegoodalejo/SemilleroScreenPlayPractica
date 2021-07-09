package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.StoreCar.TXT_COSTTOTAL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.ValidateQuantitiesCar;
import com.sophossolutions.tasks.UpdateQuantities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StoreUpdateCarStepDefinitions {

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@When("I assign (.+)$")
	public void iAssign(Integer intCantidad) {
		theActorInTheSpotlight().wasAbleTo(UpdateQuantities.ofPetsBy(intCantidad));
	}

	@Then("I validate that the amounts are updated correctly")
	public void iValidateThatTheAmountsAreUpdatedCorrectly() {
		String strCostTotal = theActorInTheSpotlight().recall("strCostTotal");

		theActorInTheSpotlight()
				.should(seeThat(ValidateQuantitiesCar.withCostTotal(TXT_COSTTOTAL), IsEqual.equalTo(strCostTotal)));
	}
}
