package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.junit.Assert.assertEquals;

import com.sophossolutions.tasks.PostWhith;
import com.sophossolutions.util.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class ServicePostGorestStepDefinition {

	@Before
	public void setup()
	{
		setTheStage(new OnlineCast());
	}
	private String strActorName = Constants.ACTOR_NAME;

	@Given("I want to register in the Api {string}")
	public void iWantToRegisterInTheApi(String strUrl) {
		theActorCalled(strActorName).can(CallAnApi.at(strUrl));
	}
	@When("he requests to the endpoint {string}")
	public void heRequestsToTheEndpoint(String strEndpoint, DataTable dataTable) {
		theActorInTheSpotlight().wasAbleTo(PostWhith.oautn2(strEndpoint,dataTable));
	}

}
