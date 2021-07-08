package com.sophos.semillero.stepdefinitions;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import org.hamcrest.core.IsEqual;


import com.sophos.semillero.questions.ResponseHas;
import com.sophos.semillero.tasks.MakeAGetRequest;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiGetReqresStepDefinitions {
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("I want to make an api request on {string}")
	public void iWantToMakeAnApiRequestOn(String strUrl) {
		theActorCalled("Group2").whoCan(CallAnApi.at(strUrl));
	}

	@When("I send the request {string} and id {string}")
	public void iSendTheRequestAndId(String strEndPoint, String strUserId) {
		theActorInTheSpotlight().wasAbleTo(MakeAGetRequest.withoutAuthentication(strEndPoint, strUserId));
	}

	@Then("I check that my response is {int}")
	public void iCheckThatMyResponseIsAndHasTheSameId(Integer int1) {
		theActorInTheSpotlight().should(seeThat(ResponseHas.the("STATUS_CODE"),IsEqual.equalTo(int1)));
	}

}
