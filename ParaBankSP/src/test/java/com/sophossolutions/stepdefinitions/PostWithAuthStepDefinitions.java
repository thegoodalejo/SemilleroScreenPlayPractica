package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.GetWith;

public class PostWithAuthStepDefinitions {
	
	@Given("{string} sets an url {string}")
	public void setsAnUrl(String strActor, String strUrl) {
	    theActorCalled(strActor).whoCan(CallAnApi.at(strUrl));
	}

	@When("he requests to the endpoint {string} and id {string}")
	public void heRequestsToTheEndpointAndId(String strEndPoint, String strIdUser) {
	    theActorInTheSpotlight().wasAbleTo(GetWith.oAuth(strEndPoint, strIdUser));
	}

	@Then("he should validate that the status code is {int}")
	public void heShouldValidateThatTheStatusCodeIs(Integer int1) {
	    
	}

}
