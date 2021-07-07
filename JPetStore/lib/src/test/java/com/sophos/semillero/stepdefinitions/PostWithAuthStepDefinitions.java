package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.semillero.tasks.GetWith;

public class PostWithAuthStepDefinitions {
	
	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} sets an url {string}")
	public void setsAnUrl(String strActor, String strUrl) {
		System.out.println("Given");
		theActorCalled(strActor).whoCan(CallAnApi.at(strUrl));
	}

	@When("he requests to the endpoint {string} and id {string}")
	public void heRequestsToTheEndpoint(String strEndpoint, String strIdUser) {
		theActorInTheSpotlight().wasAbleTo(GetWith.oAuth2(strEndpoint, strIdUser));
	}

	@Then("he should validate that the status code is {int}")
	public void vuelvoAlMenuPrincipal(int intStatusCode) {
	}

}
