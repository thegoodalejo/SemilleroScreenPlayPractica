package com.grupo3.stepdefs;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.tasks.CallThePostApiNoAuth;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostWithoutAuthStepDefinitions
{
	@When("Envio al endpoint {string} la info")
	public void envioAlEndpointLaInfo(String endpoint, DataTable dataTable)
	{
		theActorInTheSpotlight().wasAbleTo(CallThePostApiNoAuth.onEndpoint(endpoint, dataTable));
	}

	@Then("Valido que la solicitud POST retorne el codigo {int}")
	public void validoQueLaSolicitudPOSTRetorneElCodigo(Integer int1)
	{
		
	}
}