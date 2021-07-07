package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.sophossolutions.ui.StoreCar.TXT_COSTTOTAL;
import com.sophossolutions.tasks.UpdateQuantities;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.Wait;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.sophossolutions.questions.ValidateQuantitiesCar;

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
		String strCostTotal = theActorInTheSpotlight().recall("strCostTotal");
		System.out.println(strCostTotal);
		theActorInTheSpotlight().should(seeThat(ValidateQuantitiesCar.withCostTotal(TXT_COSTTOTAL), IsEqual.equalTo(strCostTotal)));
	}
}
