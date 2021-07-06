package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.tasks.GetWhith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class PostWithAuthStepDefinition
{
	@Given("{string} sets an url {string}")
	public void setsAnUrl(String strActor, String strUrl) {
		System.out.println("@GIVEN");
		theActorCalled(strActor).can(CallAnApi.at(strUrl));
	}

	@When("he requests to the endpoint {string} and id {string}")
	public void heRequestsToTheEndpointAndId(String strEndpoint, String strid) {
		System.out.println("@WHEN");
		theActorInTheSpotlight().wasAbleTo(GetWhith.oautn2(strEndpoint, strid));
	}

	@Then("he should validate that the status code is {int}")
	public void heShouldValidateThatTheStatusCodeIs(Integer int1)
	{
		System.out.println("@THEN");
		
	}
	
	
}