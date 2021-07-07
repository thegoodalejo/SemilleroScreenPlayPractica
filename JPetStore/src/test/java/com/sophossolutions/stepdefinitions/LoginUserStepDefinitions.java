package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


import com.sophossolutions.tasks.Login;
import com.sophossolutions.ui.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginUserStepDefinitions {
	
	private String strActorName = "Juan Miguel y Santaigo ";
	
	@Before()
	public void setup(){	
		setTheStage(new OnlineCast());
	}

	@Given("Navegar a la pagina {string}")
	public void navegarALaPagina(String urlHome) {
		theActorCalled(strActorName).wasAbleTo(Open.url(urlHome));
	}

	@When("Ingreso con el usuario {string} y clave {string}")
	public void ingresoConElUsuarioYClave(String strUserName, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.withCredential(strUserName, strPassword));
	}

	@Then("Observar la pagina inicio de sesion")
	public void observarLaPaginaInicioDeSesion() {
		theActorInTheSpotlight().should(seeThat(the(HomePage.TXT_WELCOME), isVisible()));
	}
	
}
