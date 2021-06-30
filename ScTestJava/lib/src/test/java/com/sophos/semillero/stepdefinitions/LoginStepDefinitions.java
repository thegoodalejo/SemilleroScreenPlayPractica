package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.sophos.semillero.tasks.LoginBanco;
import com.sophos.semillero.ui.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class LoginStepDefinitions {

	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
		theActorCalled("Andres Lopez").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUser, String string2) {
		theActorCalled("Andres Lopez").wasAbleTo(LoginBanco.withCredential(strUser, string2));

	}

	@Then("Deberia mostrar la pagina principal")
	public void deberiaMostrarLaPaginaPrincipal() {
		theActorCalled("Andres Lopez").should(seeThat(the(LoginPage.LOGIN_TABLE), isVisible()));

	}

	public void setup() {
		setTheStage(new OnlineCast());
	}

}
