package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.ValidateResponse;
import com.sophos.semillero.tasks.GetCommentsWithAuth;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GetWithAuthStepDefinition {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Que {string} quiere realizar la consulta en la api {string}")
	public void queQuiereRealizarLaConsultaEnLaApi(String strActor, String strUrl) {
		theActorCalled(strActor).whoCan(CallAnApi.at(strUrl));
	}

	@When("Solicita el endpoint {string} y el genero {string}")
	public void solicitaElEndpointYElId(String strEndpoint, String strID) {
		theActorInTheSpotlight().wasAbleTo(GetCommentsWithAuth.in(strEndpoint, strID));
	}

	@Then("Valida que la respuesta tenga status {int}")
	public void validaQueLaRespuestaTengaStatusYContengaId(Integer intStatus) {
		theActorInTheSpotlight().should(seeThat(ValidateResponse.with(intStatus),IsEqual.equalTo(true)));
	}

}
