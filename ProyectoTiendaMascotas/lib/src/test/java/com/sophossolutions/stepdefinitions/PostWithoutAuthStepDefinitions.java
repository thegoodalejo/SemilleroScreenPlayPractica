package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.containsString;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.ResponseCode;
import com.sophossolutions.questions.ValidateLastResponse;
import com.sophossolutions.questions.ValidateTextPost;
import com.sophossolutions.tasks.SendThat;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class PostWithoutAuthStepDefinitions {

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("I want to login in the api {string}")
	public void iWantToLoginInTheApi(String strUrl) {
		theActorCalled("Duvan").whoCan(CallAnApi.at(strUrl));
	}

	@When("Send the information of user to endpoint {string}")
	public void sendTheInformationOfUserToEndpoint(String strEndPoint, DataTable userInfo) {
		theActorInTheSpotlight().attemptsTo(SendThat.info(strEndPoint, userInfo));		
	}

	@Then("Verify that api response contains status {int} and token {string}")
	public void verifyThatApiResponseContainsStatusAndToken(Integer code, String strToken) {
		String strResponse = theActorInTheSpotlight().recall("Response");
		theActorInTheSpotlight().should(seeThat("code of response ", ResponseCode.was(), equalTo(code)));
		theActorInTheSpotlight().should(seeThat(ValidateLastResponse.withData(), containsString(strToken)));
		
	}

}
