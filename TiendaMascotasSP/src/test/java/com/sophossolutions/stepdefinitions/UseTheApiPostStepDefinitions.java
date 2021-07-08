package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class UseTheApiPostStepDefinitions {
	
	@Given("Deseo realizar un registro en la API {string}")
	public void deseoRealizarUnRegistroEnLaAPI(String strUrl) {
		theActorCalled("grupo_5").whoCan(CallAnApi.at(strUrl));
	    
	}

	@When("Enviar los datos a la API {string}")
	public void enviarLosDatosALaAPI(String string, io.cucumber.datatable.DataTable dataTable) {
		
			    
	}

	@Then("Verificar que la respuesta sea un {int}")
	public void verificarQueLaRespuestaSeaUn(Integer int1) {
	    
	}

}
