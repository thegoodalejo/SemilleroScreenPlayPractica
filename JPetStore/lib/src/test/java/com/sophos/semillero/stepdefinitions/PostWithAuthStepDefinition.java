package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.ValidateResponse;
import com.sophos.semillero.tasks.PostWithAuth;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class PostWithAuthStepDefinition {

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Que {string} quiere crear un post de usuario en la api {string}")
	public void queQuiereCrearUnPostDeUsuarioEnLaApi(String strActor, String strUrl) {
		theActorCalled(strActor).whoCan(CallAnApi.at(strUrl));
	}

	@When("Envio informacion del post al endpoint {string}")
	public void envioInformacionDelPostAlEndpoint(String strEndpoint, DataTable dataUserInfo) {
		theActorInTheSpotlight().wasAbleTo(PostWithAuth.with(strEndpoint,dataUserInfo));
	}

	@Then("Valido que la respuesta tenga status {int}")
	public void validoQueLaRespuestaTengaStatus(Integer intStatus) {
		theActorInTheSpotlight().should(seeThat(ValidateResponse.with(intStatus),IsEqual.equalTo(true)));
	}
}
