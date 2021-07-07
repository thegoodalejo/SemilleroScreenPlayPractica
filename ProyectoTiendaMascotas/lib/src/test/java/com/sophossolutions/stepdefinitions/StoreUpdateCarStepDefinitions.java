package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreUpdateCarStepDefinitions {

	@When("I assign (.+) pets to (.+)$")
	public void iAssignPetsToFISH(Integer intCantidad, String strEspecie) {
		System.out.println("@WHEN " + strEspecie + " " + intCantidad);
	}

	@Then("I validate that the amounts are updated correctly")
	public void iValidateThatTheAmountsAreUpdatedCorrectly() {
		System.out.println("@THEN");
	}
}
