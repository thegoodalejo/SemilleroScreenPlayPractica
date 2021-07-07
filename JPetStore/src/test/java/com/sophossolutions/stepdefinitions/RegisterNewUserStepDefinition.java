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
	private String strActorName = "Juan Miguel y Santaigo ";
	
	@Before()
	public void setup()
	{	
		setTheStage(new OnlineCast());
	}
	
	@Given("It must be in the url {string}")
	public void debeEstarEnLaUrl(String strUrl) {
		theActorCalled(strActorName).wasAbleTo(Open.url(strUrl));
	}

	@When("You must enter the information {string}")
	public void debeIngresarLaInformacion(String datos) {
		theActorCalled(strActorName).wasAbleTo(RegisterUser.with(datos));
	}

	@Then("The information must be in the fields")
	public void debeEstarLaInformacionEnLosCampos() {
	    System.out.println("@Then");
	}

	
	
	
}