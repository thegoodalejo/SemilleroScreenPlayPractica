package com.grupo3.stepdefs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.questions.TheLatestApiResponse;
import com.grupo3.tasks.CallTheGetApiNoAuth;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetWithoutAuthStepDefinition
{
	@When("Pidir el endpoint {string}")
	public void pidirElEndpoint(String endpoint)
	{
		theActorInTheSpotlight().wasAbleTo(CallTheGetApiNoAuth.onEndpoint(endpoint));
	}

	@Then("Validar que la solicitud retorne el codigo {int} y id {int}")
	public void validarQueLaSolicitudRetorneElCodigoYId(Integer code, Integer id)
	{
		theActorInTheSpotlight().should(seeThat(TheLatestApiResponse.shouldHave("code", code).and("data/id", id)));
	}
}