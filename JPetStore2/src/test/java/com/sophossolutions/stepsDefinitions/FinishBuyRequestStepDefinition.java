package com.sophossolutions.stepsDefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class FinishBuyRequestStepDefinition {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@When("Finalizo compra")
	public void finalizoCompra() {
	}

	@Then("Valido que la orden de compra muestre {string}")
	public void validoQueLaOrdenDeCompraMuestre(String string) {
	}
}
