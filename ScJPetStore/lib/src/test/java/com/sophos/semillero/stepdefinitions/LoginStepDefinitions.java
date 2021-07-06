package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the; //evalua un target
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; //ya conoce el actor
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.ui.HomePage;


public class LoginStepDefinitions {
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
		theActorCalled("Angel Vivas").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strName, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.withCredentials(strName, strPassword));
	}

	@Then("Valido el inicio de sesion")
	public void validoElInicioDeSesion() {
		theActorInTheSpotlight().should(seeThat(the(HomePage.TXT_USER_NAME), isVisible()));	
	}
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
