package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.tasks.GetWithAuth;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import com.sophossolutions.questions.ValidateGetWithAuth;
import com.sophossolutions.tasks.*;

public class GetWithAuthStepDefinitions {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} wants to get users from {string}")
	public void wantsToGetUsersFrom(String strActor, String strUrl) {
	    theActorCalled(strActor).whoCan(CallAnApi.at(strUrl));
	}

	@When("he required users in the endpoint {string} and with status {string}")
	public void heRequiredUsersInTheEndpointAndWithStatus(String strEndPoint, String strStatus) {
		theActorInTheSpotlight().wasAbleTo(GetWithAuth.with(strEndPoint, strStatus));
	}

	@Then("I validate that the users have {string} status")
	public void iValidateThatTheUsersHaveStatus(String strStatus) {
		
		String strResponseData= theActorInTheSpotlight().recall("strResponseData");
		
		theActorInTheSpotlight().should(seeThat(ValidateGetWithAuth.withStatus(strResponseData, strStatus), IsEqual.equalTo(true)));
		
	}

	
}
