package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.exceptions.ExceptionMsg;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.tasks.GoToHomePage;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.OpenAccount;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.OpenAccountPage;

public class LoginStepDefinitions {
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
		theActorCalled("Juan Carlos").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUser, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.withCredential(strUser, strPassword));
	}

	@Then("Valido que haya iniciado sesion satisfactoriamente")
	public void validoQueHayaIniciadoSesionSatisfactoriamente() {
		String strTitle = "Account Services";
		theActorInTheSpotlight().should(seeThat(TextObtained.in(HomePage.TXT_WELCOME_MSG), IsEqual.equalTo(strTitle))
				.orComplainWith(ExceptionMsg.class, "Error en login"));
	}

	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}
}
