package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.ValidateIDMsj;

import com.sophos.semillero.tasks.PostRegister;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class PostRegisterUnsuccessfulStepDefinition {

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Que {string} quiere realizar un registro en la api {string}")
	public void queQuiereRealizarUnRegistroEnLaApi(String strActor, String strUrl) {
		theActorCalled(strActor).whoCan(CallAnApi.at(strUrl));
	}

	@When("Envio la informacion del usuario para el endpoint {string}")
	public void envioLaInformacionDelUsuarioParaElEndpoint(String strEndpoint, DataTable dataUserInfo) {
		theActorInTheSpotlight().wasAbleTo(PostRegister.with(strEndpoint,dataUserInfo));
	}

	@Then("Valido que la respuesta tenga status {int} y contenga error {string}")
	public void validoQueLaRespuestaTengaStatusYContengaError(Integer intStatus, String strMsj) {
		theActorInTheSpotlight().should(seeThat(ValidateIDMsj.with(intStatus, strMsj),IsEqual.equalTo(true)));
	}
}
