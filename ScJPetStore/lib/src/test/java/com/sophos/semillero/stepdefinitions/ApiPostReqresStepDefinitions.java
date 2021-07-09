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
	
	@Given("Quiero hacer una peticion en la api de tipo post {string}")
	public void quieroHacerUnaPeticionEnLaApiDeTipoPost(String strUrl) {
		theActorCalled("Group2").whoCan(CallAnApi.at(strUrl));
	}

	@When("Envio la informacion para la peticion {string}")
	public void envioLaInformacionParaLaPeticion(String string,DataTable dataTable) {
		Map<String,String> body=dataTable.asMap(String.class,String.class);
		theActorInTheSpotlight().wasAbleTo(MakeAPostReqres.withoutAuthentication(string, body));
	}

	@Then("Valido la respuesta tenga status {int} id {string} y token {string}")
	public void validoLaRespuestaTengaStatusIdYToken(Integer strStatus, String strId, String strToken) {
		theActorInTheSpotlight().should(seeThat(ResponseHas.the("STATUS_CODE"),IsEqual.equalTo(strStatus)));
		theActorInTheSpotlight().should(seeThat(PostResponseHas.the("ID"),IsEqual.equalTo(strId)));
		theActorInTheSpotlight().should(seeThat(PostResponseHas.the("TOKEN"),IsEqual.equalTo(strToken)));
	}
}
