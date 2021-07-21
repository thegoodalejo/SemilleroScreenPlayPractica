package com.sophossolutions.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.sophossolutions.task.AddressUser;
import com.sophossolutions.task.BasicUserData;
import com.sophossolutions.task.UserDevices;
import com.sophossolutions.task.UserPassword;
import com.sophossolutions.ui.HomePage;
import static com.sophossolutions.ui.HomePage.BTN_REGISTER;
import static com.sophossolutions.ui.UserFinalDataPage.BTN_SUBMIT_ALL;

public class UiTestRegisterStepDefinitions {

	private String nameActor = "Juan Miguel";
	HomePage homePage;
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Quiero ingresar a la pagina principal")
	public void quieroIngresarALaPaginaPrincipal() {
	    theActorCalled(nameActor).wasAbleTo(Open.browserOn(homePage));
	    theActorInTheSpotlight().wasAbleTo(Click.on(BTN_REGISTER));
	}
	@When("Registrarme con los datos del Usuario")
	public void registrarmeConLosDatosDelUsuario(DataTable dataUserBasic) {
		theActorInTheSpotlight().wasAbleTo(BasicUserData.write(dataUserBasic));
	}

	@When("el cual vive en")
	public void elCualViveEn(DataTable dataUserAddress) {
		theActorInTheSpotlight().wasAbleTo(AddressUser.write(dataUserAddress));
	}

	@When("y tiene los dispositivos")
	public void yTieneLosDispositivos(DataTable dataUserDevices) {
		theActorInTheSpotlight().wasAbleTo(UserDevices.write(dataUserDevices));
	}

	@When("cuya clave de usuario es (.+)$")
	public void cuyaClaveDeUsuarioEs(String strPassword) {
	    theActorInTheSpotlight().wasAbleTo(UserPassword.write(strPassword));
	}

	@Then("Registrarme sin dar click")
	public void registrarmeSinDarClick() {
	    theActorInTheSpotlight().should(seeThat(the(BTN_SUBMIT_ALL), isVisible()));
	}
}
