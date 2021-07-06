package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.questions.NumberAcount;
import com.sophossolutions.tasks.LoginTask;
import com.sophossolutions.tasks.RegisterUser;
import com.sophossolutions.ui.ParabankLogin;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.util.Constants;

import org.hamcrest.core.IsEqual;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegisterNewUserStepDefinition
{
	@Before()
	public void setup()
	{	
		setTheStage(new OnlineCast());
	}
	
	@Given("Debe estar en la url {string}")
	public void debeEstarEnLaUrl(String strUrl) {
		theActorCalled("Santiago Juan").wasAbleTo(Open.url(strUrl));
	}

	@When("Debe ingresar la informacion {string}")
	public void debeIngresarLaInformacion(String datos) {
		theActorCalled("Santiago Juan").wasAbleTo(RegisterUser.with(datos));
	}

	@Then("Debe estar la informacion en los campos")
	public void debeEstarLaInformacionEnLosCampos() {
	    System.out.println("@Then");
	}

	
	
	
}