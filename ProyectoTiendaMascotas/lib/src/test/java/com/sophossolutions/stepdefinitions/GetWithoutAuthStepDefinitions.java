package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.hasItem;
import com.sophossolutions.tasks.GetUsers;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GetWithoutAuthStepDefinitions {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("I want to get list of users from {string}")
	public void iWantToGetListOfUsersFrom(String strUrl) {
		theActorCalled("Duvan").whoCan(CallAnApi.at(strUrl));
	}

	@When("he required users in the endpoint {string} and page {string}")
	public void heRequiredUsersInTheEndpointAndPage(String strEndPoint, String strPage) {
		theActorInTheSpotlight().attemptsTo(GetUsers.fromPage(strPage, strEndPoint));
	}

	@Then("I validate that the code {int} and are of page {string}")
	public void iValidateThatTheCodeAndAreOfPage(Integer intStatus, String strPage) {
	    //theActorInTheSpotlight().should(seeThat("code of response ", ResponseCode.was(), equalTo(intStatus)));
	    
	    //String response2 = theActorInTheSpotlight().recall("strResponse");
		theActorInTheSpotlight().should(seeThatResponse("the page should be correct", response -> response.statusCode(200).body("page", hasItem(2))));
	}
}
