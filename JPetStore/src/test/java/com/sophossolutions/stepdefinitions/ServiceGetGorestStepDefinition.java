package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.junit.Assert.assertEquals;

import java.util.Properties;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.IdProduc;
import com.sophossolutions.questions.Info;
import com.sophossolutions.tasks.GetWhith;
import com.sophossolutions.ui.CarPage;
import com.sophossolutions.util.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class ServiceGetGorestStepDefinition {

	@Before
	public void setup()
	{
		setTheStage(new OnlineCast());
	}
	private String strActorName = Constants.ACTOR_NAME;
	
	@Given("I want to register in the page api {string}")
	public void iWantToRegisterInThePageApi(String strUrl) {
		theActorCalled(strActorName).can(CallAnApi.at(strUrl));
	}

	@When("he requests to the endpoint {string} and id {string}")
	public void heRequestsToTheEndpointAndId(String strEndpoint, String strid) {
		theActorInTheSpotlight().wasAbleTo(GetWhith.oautn2(strEndpoint, strid));
	}

	@Then("he should validate that the status code is {string}")
	public void heShouldValidateThatTheStatusCodeIs(String status) {
		assertEquals(SerenityRest.lastResponse().jsonPath().get("code").toString(), status);
		theActorInTheSpotlight().should(seeThat(Info.json("code"),IsEqual.equalTo(status)));
		
	}
	@Then("Must see name {string}")
	public void mustSeeName(String name) {
		assertEquals(SerenityRest.lastResponse().jsonPath().get("data.name").toString(), name);
		theActorInTheSpotlight().should(seeThat(Info.json("data.name"),IsEqual.equalTo(name)));
		
	}
}
