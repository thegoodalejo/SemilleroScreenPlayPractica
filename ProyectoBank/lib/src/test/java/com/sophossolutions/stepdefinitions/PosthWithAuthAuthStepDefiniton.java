package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.GetWith;

public class PosthWithAuthAuthStepDefiniton {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} sets an url {string}")
	public void setsAnUrl(String strActor, String strUrl) {
	   theActorCalled(strActor).can(CallAnApi.at(strUrl));
	}
	
	@When("he request to the endpoint {string} and id {string}")
	public void heRequestToTheEndpointAndId(String strEndPoint, String strId) {
		theActorInTheSpotlight().wasAbleTo(GetWith.oauth2(strEndPoint, strId));
	}

	@Then("he should validate that the status coide is {int}")
	public void heShouldValidateThatTheStatusCoideIs(Integer int1) {
		System.out.println("@THEN");
	}
	
}
