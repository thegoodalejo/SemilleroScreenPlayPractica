package com.sophos.semillero.stepdefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.ui.ParaBankHomePage;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;




public class LoginParaBankStepDefinitions {
	
	

	@Given("Debe  ir a la pagina de {string}")
	public void debeIrALaPaginaDe(String url) {
		theActorCalled("Santiago Espinal").wasAbleTo(Open.url(url));
	}

	@When("Ingresa el usuario {string} con password {string}")
	public void ingresaLasCredencialesJohnDemoConNumeroDeCuenta(String user, String password) {
		theActorCalled("Santiago Espinal").wasAbleTo(Login.in(user,password));
		
	}

	@Then("valida si esta en la pagina de bienvenida")
	public void validaQueElNumeroDeCuentaEsteEnElResumenDeCuenta() {
		theActorInTheSpotlight().should(seeThat(the(ParaBankHomePage.TITLE_PAGE),isVisible()));
	}
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	
}
