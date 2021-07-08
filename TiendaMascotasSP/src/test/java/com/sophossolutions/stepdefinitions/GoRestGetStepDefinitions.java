package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.GetRequest;
import com.sophossolutions.tasks.GetWith;

public class GoRestGetStepDefinitions {
	
	@Given("Sets an url {string}")
	public void setsAnUrl(String strUrl) {
		theActorCalled("grupo_5").whoCan(CallAnApi.at(strUrl));
	}

	@When("I requests to the endpoint {string} and id {string}")
	public void iRequestsToTheEndpointAndId(String strEndPoint, String strIdUser) {
		theActorInTheSpotlight().wasAbleTo(GetWith.oAuth(strEndPoint, strIdUser));
	}

	@Then("Y should validate that the status code is {int}")
	public void yShouldValidateThatTheStatusCodeIs(Integer intStatusCode) {
		theActorInTheSpotlight().should(seeThat(GetRequest.code(),IsEqual.equalTo(intStatusCode)));
	}

}
