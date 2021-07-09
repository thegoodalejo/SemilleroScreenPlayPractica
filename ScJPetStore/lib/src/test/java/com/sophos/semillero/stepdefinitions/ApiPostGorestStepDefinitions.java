package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the; //evalua un target

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; //ya conoce el actor

import com.sophos.semillero.questions.PostResponseGorestVerification;
import com.sophos.semillero.questions.ResponseHas;
import com.sophos.semillero.tasks.MakeAPostGorest;


public class ApiPostGorestStepDefinitions {	
	
	@Given("{string} sets an url {string}")
	public void setsAnUrl(String strActor, String strUrl) {
	    theActorCalled(strActor).whoCan(CallAnApi.at(strUrl)); //set de la url base de las peticiones para el actor
	}

	@When("he requests to the endpoint {string} and id {string}")
	public void heRequestsToTheEndpointAndId(String endPoint, String strUserId) {
		theActorInTheSpotlight().wasAbleTo(MakeAPostGorest.oauth(endPoint, strUserId));
	}

	@Then("he should validate that the status code is {string} and user")
	public void heShouldValidateThatTheStatusCodeIs(String strStatus) {
		theActorInTheSpotlight().should(seeThat(PostResponseGorestVerification.with(strStatus),IsEqual.equalTo(true)));
	}

}
