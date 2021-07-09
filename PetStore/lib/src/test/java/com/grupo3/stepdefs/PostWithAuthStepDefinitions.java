package com.grupo3.stepdefs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.questions.TheLatestApiResponse;
import com.grupo3.tasks.CallThePostApi;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PostWithAuthStepDefinitions {

	@When("Envio la informacion de la publicacion al endpoint {string}")
	public void envioLaInformacionDeLaPublicacionAlEndpoint(String endpoint) {
		
		theActorInTheSpotlight().wasAbleTo(CallThePostApi.onEndpoint(endpoint));
	}

	@Then("Valido que la solicitud retorne con codigo {int}")
	public void validoQueLaSolicitudRetorneConCodigo(Integer responseCode) {
		theActorInTheSpotlight().should(seeThat(TheLatestApiResponse.shouldHave("code", responseCode)));
	}
}
