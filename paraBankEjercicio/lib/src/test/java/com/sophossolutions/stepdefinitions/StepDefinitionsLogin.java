package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.TextObtained;
import com.sophossolutions.semillero.tasks.Login;
import com.sophossolutions.ui.HomePage;


public class StepDefinitionsLogin {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Quiero ir a la pagina {string}")
	public void quieroIrALaPagina(String txtUrl) {
		theActorCalled("Juan Miguel").wasAbleTo(Open.url(txtUrl));
	}

	@When("Usando las credenciales usuario {string} y clave {string}")
	public void usandoLasCredencialesUsuarioYClave(String txtUser, String txtPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.whitCredentials(txtUser, txtPassword));
	}

	@Then("Validar el acceso correcto a la pagina de usuario {string}")
	public void validarElAccesoCorrectoALaPaginaDeUsuario(String txtMssg) {
		theActorInTheSpotlight().should(seeThat(TextObtained.inTitlePage(HomePage.TXT_TITLE_PAGE), IsEqual.equalTo(txtMssg)));
	}

}
