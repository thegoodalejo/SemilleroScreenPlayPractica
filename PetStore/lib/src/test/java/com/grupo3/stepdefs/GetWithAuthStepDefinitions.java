package com.grupo3.stepdefs;

import io.cucumber.java.en.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.questions.TheLatestApiResponse;
import com.grupo3.tasks.CallTheGetApi;

public class GetWithAuthStepDefinitions {


	@When("Pido el usuario con id {string} al endpoint {string}")
	public void pidoElUsuarioConIdAlEndpoint(String usrId, String endpoint) {
	    theActorInTheSpotlight().wasAbleTo(CallTheGetApi.onEndpoint(endpoint).withParameter(usrId));
	}

	@Then("Valido que la solicitud retorne con codigo {int} y con id {int}")
	public void validoQueLaSolicitudRetorneConCodigoYConId(Integer responseCode, Integer receivedId) {
		theActorInTheSpotlight().should(seeThat(TheLatestApiResponse.shouldHave("code", responseCode).and("data/id", receivedId)));
	}
	
}
