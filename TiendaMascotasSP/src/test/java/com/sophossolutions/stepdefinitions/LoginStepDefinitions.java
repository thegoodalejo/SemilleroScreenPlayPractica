package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.sophossolutions.tasks.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoginStepDefinitions {
	@Given("La pagina web del banco {string}")
	public void laPaginaWebDelBanco(String strUrl) {
		theActorCalled("grupo_5").wasAbleTo(Open.url(strUrl));
	    
	}

	@When("Ingreso usuario {string} y password {string}")
	public void ingresoUsuarioYPassword(String strUser, String strPassword) {
		theActorCalled("grupo_5").wasAbleTo(Login.withCredentials(strUser, strPassword));	    
	   
	}

	@Then("Estoy en Inicio de la pagina")
	public void estoyEnInicioDeLaPagina() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}


}
