package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetWithAuthStepDefinitions {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} wants to get users from {string}")
	public void wantsToGetUsersFrom(String strActor, String strUrl) {
	    theActorCalled(strActor).whoCan(null);
	}

	@When("he required users in the endpoint {string} and with status {string}")
	public void heRequiredUsersInTheEndpointAndWithStatus(String strEndPoint, String strStatus) {
		System.out.println("@WHEN");
	}

	@Then("I validate that the users have {string} status")
	public void iValidateThatTheUsersHaveStatus(String strStatus) {
		System.out.println("@THEN");
	}

	
}
