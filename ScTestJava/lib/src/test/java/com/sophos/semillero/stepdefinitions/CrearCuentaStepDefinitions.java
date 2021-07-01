package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.AccNum;
import com.sophos.semillero.questions.TextOff;
import com.sophos.semillero.questions.TextValue;
import com.sophos.semillero.tasks.CrearCuenta;
import com.sophos.semillero.tasks.CrearCuentaAll;
import com.sophos.semillero.tasks.IrACrearCuentaNueva;
import com.sophos.semillero.ui.ParaBankHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrearCuentaStepDefinitions {

	
	@Given("Debe estar en la pagina de crear cuenta nueva")
	public void debeEstarEnLaPaginaDeBienvenida() {
		theActorInTheSpotlight().wasAbleTo(IrACrearCuentaNueva.in(ParaBankHomePage.ENLA_NEW_ACCOUNT));
	}

	@When("Debe la cuenta ser de ahorros con un numero aleatorio")
	public void debeCrearUnaCuentaDeAhorros() {
		theActorInTheSpotlight().wasAbleTo(CrearCuentaAll.on());
	}

	@Then("Debe ver el numero de la cuenta en la tabla")
	public void debeVerElNumeroDeLaCuentaEnLaTabla() {
		String id = theActorInTheSpotlight().recall("NumeroCuentaNew");
		theActorInTheSpotlight().should(seeThat(TextOff.field(ParaBankHomePage.NC_TABLA.of(id))
				,IsEqual.equalTo(id)));
		System.out.println(TextOff.of(ParaBankHomePage.NC_BALANCE.of(id)));
		
	}
}
