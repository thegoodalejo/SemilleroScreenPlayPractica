package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.PostWhith;
import static com.sophossolutions.util.Constants.ACTOR_NAME;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class ServicePostGorestStepDefinition {

	private String strActorName = ACTOR_NAME;
	
	@Before
	public void setup()
	{
		setTheStage(new OnlineCast());
	}
	
	@Given("I want to register in the Api {string}")
	public void iWantToRegisterInTheApi(String strUrl) {
		theActorCalled(strActorName).can(CallAnApi.at(strUrl));
	}
	@When("he requests to the endpoint {string}")
	public void heRequestsToTheEndpoint(String strEndpoint, DataTable dataTable) {
		theActorInTheSpotlight().wasAbleTo(PostWhith.oautn2(strEndpoint,dataTable));
	}

}
