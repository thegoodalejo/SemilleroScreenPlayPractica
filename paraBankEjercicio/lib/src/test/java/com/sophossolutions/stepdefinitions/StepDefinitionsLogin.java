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
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.TextObtained;
import com.sophossolutions.semillero.tasks.Login;
import static com.sophossolutions.ui.HomePage.TXT_TITLE_PAGE;


public class StepDefinitionsLogin {
	
	private String strName = "Juan Miguel";
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Quiero ir a la pagina {string}")
	public void quieroIrALaPagina(String txtUrl) {
		theActorCalled(strName).wasAbleTo(Open.url(txtUrl));
	}

	@When("Usando las credenciales usuario {string} y clave {string}")
	public void usandoLasCredencialesUsuarioYClave(String txtUser, String txtPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.whitCredentials(txtUser, txtPassword));
	}

	@Then("Validar el acceso correcto a la pagina de usuario {string}")
	public void validarElAccesoCorrectoALaPaginaDeUsuario(String txtMssg) {
		theActorInTheSpotlight().should(seeThat(TextObtained.inTitlePage(TXT_TITLE_PAGE), IsEqual.equalTo(txtMssg)));
		theActorInTheSpotlight().should(seeThat(the(TXT_TITLE_PAGE), isVisible()));
		theActorInTheSpotlight().should(seeThat(the(TXT_TITLE_PAGE), containsText(txtMssg)));
	}

}
