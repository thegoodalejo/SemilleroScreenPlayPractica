package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophos.semillero.questions.Result;
import com.sophos.semillero.tasks.LoginBanco;
import com.sophos.semillero.tasks.RegistrarCuenta;
import com.sophos.semillero.tasks.VerificarCuenta;
import com.sophos.semillero.ui.ListAcounts;
import com.sophos.semillero.ui.RegisterPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistroBancoStepDefinitions {
	
	String strNumeroCuenta = "";
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
		theActorCalled("Andres Lopez").wasAbleTo(Open.url(strUrl));
	   
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUser, String strPassword) {
		theActorCalled("Andres Lopez").wasAbleTo(LoginBanco.withCredential(strUser, strPassword));
	    
	}
	@When("Registrar una nueva cuenta {string}")
	public void registrarUnaNuevaCuenta(String strValue) {
		theActorCalled("Andres Lopez").wasAbleTo(RegistrarCuenta.withValue(strValue));
		strNumeroCuenta=RegisterPage.NEW_ACOUNT.resolveFor(theActorInTheSpotlight()).getTextValue();
		System.out.println(strNumeroCuenta);
	
	}

	@Then("Valido que la cuenta fue creada")
	public void validoQueLaCuentaFueCreada() {
		theActorCalled("Andres Lopez").wasAbleTo(VerificarCuenta.verifyAccount());
		theActorInTheSpotlight().should(seeThat(Result.in(ListAcounts.NUM_CUENTA.of(strNumeroCuenta)),IsEqual.equalTo(strNumeroCuenta)));
	   
	}
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
