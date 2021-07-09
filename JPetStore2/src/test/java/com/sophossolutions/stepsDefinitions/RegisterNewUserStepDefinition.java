package com.sophossolutions.stepsDefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegisterNewUserStepDefinition {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("Deseo ir a pagina {string}")
	public void deseoIrALaPagina(String string) {
	}

	@When("Ingreso User ID {string}, New password {string}, Repeat password {string}, First name {string}, Last name {string}, Email {string}, Phone {string}, Address1 {string}, Address2 {string}, City {string}, State {string}, Zip {string}, Country {string}")
	public void ingresoUserIDNewPasswordRepeatPasswordFirstNameLastNameEmailPhoneAddress1Address2CityStateZipCountry(
			String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8, String string9, String string10, String string11, String string12,
			String string13) {
	}
}
