package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.tasks.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import com.sophossolutions.questions.ResultLogin;
import com.sophossolutions.ui.HomePage;

public class LoginStepDefinitions {
	@Given("La pagina web del banco {string}")
	public void laPaginaWebDelBanco(String strUrl) {
		theActorCalled("grupo_5").wasAbleTo(Open.url(strUrl));

	}

	@When("Ingreso usuario {string} y password {string}")
	public void ingresoUsuarioYPassword(String strUser, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.withCredentials(strUser, strPassword));

	}

	@Then("Estoy en Inicio de la pagina")
	public void estoyEnInicioDeLaPagina() {
		theActorInTheSpotlight().should(seeThat(ResultLogin.in(HomePage.MSG_WELCOME),IsEqual.equalTo("Welcome Andres!")));
	}

}
