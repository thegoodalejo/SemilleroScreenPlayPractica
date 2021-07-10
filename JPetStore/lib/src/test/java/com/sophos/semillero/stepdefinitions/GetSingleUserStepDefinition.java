package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.ValidateIDStatus;
import com.sophos.semillero.tasks.GetUser;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GetSingleUserStepDefinition {

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Que {string} quiere realizar una consulta en la api {string}")
	public void queQuiereRealizarUnaConsultaEnLaApi(String strActor, String strUrl) {
		theActorCalled(strActor).whoCan(CallAnApi.at(strUrl));
	}

	@When("Solicito la informacion de un usuario con el endpoint {string}")
	public void solicitoLaInformacionDeUnUsuarioConElEndpoint(String strEndpoint) {
		theActorInTheSpotlight().wasAbleTo(GetUser.in(strEndpoint));
	}

	@Then("Valido que la respuesta tenga status {int} y contenga id {string}")
	public void validoQueLaRespuestaTengaStatusYContengaId(Integer intStatus, String strID) {
		theActorInTheSpotlight().should(seeThat(ValidateIDStatus.with(intStatus, strID),IsEqual.equalTo(true)));
//		theActorInTheSpotlight().should(seeThatResponse("User details should be correct", response -> response.statusCode(200).body("data.first_name", equalTo("George")).body("data.last_name", equalTo("Bluth"))));
	}
	
}
