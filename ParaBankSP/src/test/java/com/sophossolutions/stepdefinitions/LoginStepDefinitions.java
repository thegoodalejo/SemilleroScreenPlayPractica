package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophossolutions.tasks.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

public class LoginStepDefinitions {

	@Given("La pagina web del banco {string}")
	public void laPaginaWebDelBanco(String strUrl) {
		theActorCalled("Andres Guarnizo").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso usuario {string} y password {string}")
	public void ingresoUsuarioYPassword(String strUser, String strPass) {
		theActorCalled("Andres Guarnizo").wasAbleTo(Login.withCredentials(strUser, strPass));
	}

	@Then("Estoy en Home de la pagina")
	public void estoyEnHomeDeLaPagina() {
		
	}
	
}
