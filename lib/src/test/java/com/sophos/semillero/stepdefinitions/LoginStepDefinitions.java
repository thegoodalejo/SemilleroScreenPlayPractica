package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.Result;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.ui.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;




public class LoginStepDefinitions {

	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String string) {
	   theActorCalled("Santiago Espinal").wasAbleTo(Open.url(string));
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String string, String string2) {
		theActorCalled("Santiago Espinal").wasAbleTo(Login.in(string,string2));
	}

	@Then("Valido que el tiitulo sea {string}")
	public void validoQueElTiituloSea(String string) {
		theActorInTheSpotlight().should(seeThat(Result.in(HomePage.TXT_WELCOME),IsEqual.equalTo(string)));
	}
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
