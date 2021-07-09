package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import com.sophossolutions.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class PostWithAuthStepDefinitions {

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} wants to post a user in {string}")
	public void wantsToPostAUserIn(String strActor, String strUrl) {
		theActorCalled(strActor).whoCan(CallAnApi.at(strUrl));
	}

	@When("he required post a user in the endpoint {string}")
	public void heRequiredPostAUserInTheEndpoint(String strEndPoint, DataTable dataTableNewUser) {

		theActorInTheSpotlight().wasAbleTo(PostWithAuth.withData(dataTableNewUser, strEndPoint));
		
	}

	@Then("I verify that reponse contains status {int} and name {string}")
	public void iVerifyThatReponseContainsStatusAndName(int intStatus, String strName) {

		theActorInTheSpotlight().should(seeThatResponse("User name should be correct",
				response -> response.statusCode(intStatus).body("data.name", equalTo(strName))));
	}

}
