package com.sophossolutions.stepdefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;



import com.sophossolutions.tasks.RegisterUser;


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