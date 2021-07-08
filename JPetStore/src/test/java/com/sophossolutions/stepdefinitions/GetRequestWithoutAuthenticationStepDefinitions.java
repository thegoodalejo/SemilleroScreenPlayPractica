package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;

import static com.sophossolutions.util.Constants.INDEX_STATUS_CODE;

import com.sophossolutions.questions.isStatus;
import com.sophossolutions.tasks.GetUserApi;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


public class GetRequestWithoutAuthenticationStepDefinitions {
	
	@Before
	public void setup(){
		setTheStage(new OnlineCast());
	}
	
	@Given("{string} sets an url {string}")
	public void setsAnUrl(String strActorName, String strApiUrl) {
	    theActorCalled(strActorName).can(CallAnApi.at(strApiUrl));
	}

	@When("he requests to the endpoint {string} and {int}")
	public void heRequestsToTheEndpointAnd(String strEndPoint, Integer intUserNumber) {
		theActorInTheSpotlight().wasAbleTo(GetUserApi.withGet(strEndPoint, intUserNumber.toString()));
	}

	@Then("he should validate that the status code is {int}")
	public void heShouldValidateThatTheStatusCodeIs(Integer intStatusCode) {
		theActorInTheSpotlight().should(seeThat(isStatus.code(), IsEqual.equalTo(intStatusCode.toString())));
	}	
	
}
