package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.ResponseHas;
import com.sophos.semillero.questions.PostResponseHas;
import com.sophos.semillero.tasks.MakeAPostReqres;

import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class ApiPostReqresStepDefinitions {
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	    
	@Given("I want to make a request in the api of type post {string}")
	public void iWantToMakeARequestInTheApiOfTypePost(String strUrl) {
		theActorCalled("Group2").whoCan(CallAnApi.at(strUrl));
	}

	@When("I send the information for the request {string}")
	public void iSendTheInformationForTheRequest(String string,DataTable dataTable) {
		Map<String,String> body=dataTable.asMap(String.class,String.class);
		theActorInTheSpotlight().wasAbleTo(MakeAPostReqres.withoutAuthentication(string, body));
	}

	@Then("I validate the response has status {int} id {string} and token {string}")
	public void iValidateTheResponseHasStatusIdAndToken(Integer strStatus, String strId, String strToken) {
		theActorInTheSpotlight().should(seeThat(ResponseHas.the("STATUS_CODE"),IsEqual.equalTo(strStatus)));
		theActorInTheSpotlight().should(seeThat(PostResponseHas.the("ID"),IsEqual.equalTo(strId)));
		theActorInTheSpotlight().should(seeThat(PostResponseHas.the("TOKEN"),IsEqual.equalTo(strToken)));
	}
}
