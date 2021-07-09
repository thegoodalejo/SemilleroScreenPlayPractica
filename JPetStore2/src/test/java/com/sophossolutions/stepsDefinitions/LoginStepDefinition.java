package com.sophossolutions.stepsDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.exceptions.ExceptionMsg;
import com.sophossolutions.questions.TextObtained;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.tasks.GoToLogin;
import com.sophossolutions.tasks.Login;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinition {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Deseo ir a la pagina {string}")
	public void deseoIrALaPagina(String strUrl) {
		theActorCalled("Grupo 4").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUser, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(GoToLogin.usingButtonAtTheTop());
		theActorInTheSpotlight().wasAbleTo(Login.withCredential(strUser, strPassword));
	}

	@Then("Valido que haya iniciado sesion satisfactoriamente")
	public void validoQueMuestreElMensaje() {
		String strTitleWhenLoggedIn = "Sign Out";
		theActorInTheSpotlight().should(seeThat(TextObtained.in(HomePage.TXT_LOGGEDIN), IsEqual.equalTo(strTitleWhenLoggedIn))
				.orComplainWith(ExceptionMsg.class, "Invalid username or password.  Signon failed."));
	}
}
