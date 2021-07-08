package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.PostSend;
import com.sophossolutions.tasks.PostWith;

import io.cucumber.datatable.DataTable;

public class GoRestPostStepDefinitions {
	
	@When("I want to create a new user on the endpoint {string}")
	public void iWantToCreateANewUserOnTheEndpoint(String strEndPoint, DataTable userData) {
		theActorCalled("grupo_5").wasAbleTo(PostWith.oAuth(strEndPoint, userData));
	}

	@Then("I should validate that the status code is {int}")
	public void iShouldValidateThatTheStatusCodeIs(Integer intStatusCode) {
		theActorInTheSpotlight().should(seeThat(PostSend.response(),IsEqual.equalTo(intStatusCode)));
	}

}
