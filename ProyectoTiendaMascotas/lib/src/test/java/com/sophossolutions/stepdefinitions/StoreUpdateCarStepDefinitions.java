package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.sophossolutions.tasks.UpdateQuantities;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.Wait;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class StoreUpdateCarStepDefinitions {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@When("I assign (.+) pets to (.+)$")
	public void iAssignPetsToFISH(Integer intCantidad, String strEspecie) {
		theActorInTheSpotlight().wasAbleTo(UpdateQuantities.ofPetsBy(intCantidad));
	}

	@Then("I validate that the amounts are updated correctly")
	public void iValidateThatTheAmountsAreUpdatedCorrectly() {
		System.out.println("@THEN");
	}
}
